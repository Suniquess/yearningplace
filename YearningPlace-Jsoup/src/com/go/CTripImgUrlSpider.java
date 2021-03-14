package com.go;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import com.csvreader.CsvWriter;

public class CTripImgUrlSpider {

	public static void main(String[] args) throws IOException {
		String strategyUrlPath = "D:/爬虫连接/strategyURL.txt";
		String typeTxtResultPath = "D:/爬虫连接/strategyImgURLResult.txt";
		String csvResultPath = "D:/爬虫连接/csvImgUrlResult.csv";

		spiderImgURL(strategyUrlPath, typeTxtResultPath, csvResultPath);
		
		// List<String[]> list = spiderImgURL(strategyUrlPath,
		// typeTxtResultPath,csvResultPath);
		// writeCSV(list, csvResultPath);
	}

	public static final String LINE_SEPARATOR = System.getProperty("line.separator");

	private static List<String[]> spiderImgURL(String strategyUrlPath, String typeTxtResultPath, String csvResultPath)
			throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File(strategyUrlPath)));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(typeTxtResultPath)));
		String url = "";
		Connection conn;
		List<String[]> list = new ArrayList<>();
		while ((url = br.readLine()) != null && !"".equals(url)) {
			conn = Jsoup.connect(url);
			conn.timeout(40000);
			Document doc = conn.get();
			Elements els = doc.select(".img_blk img");
			String title = "";
			String img_label = "";
			if (doc.select(".title1") != null && doc.select(".title1").size() != 0)
				title = doc.select(".title1").get(0).text();
			System.out.println(title);
			// 要加上如果title是空行  就不插入了
			bw.write(title + LINE_SEPARATOR);
			if (els.size() != 0 && els != null) {
				for (Element ele : els) {
					// 对结构化标签进行解析
					// <img
					// data-original="https://dimg07.c-ctrip.com/images/100g190000015ytwq59A6_R_800_10000_Q90.jpg?proc=autoorient"
					// src="https://pages.c-ctrip.com/gs_static/common/img/1x1.gif"
					// />
					img_label = ele.outerHtml();
					int start_index = img_label.indexOf("\"");
					int end_index = img_label.indexOf("\"", start_index + 1);
					// 如果是空行就不插入了（新增加一个条件就行了）
					bw.write(img_label.substring(start_index + 1, end_index) + LINE_SEPARATOR);
					// System.out.println(img_label.substring(start_index+1,end_index));
					list.add(new String[] { title, img_label.substring(start_index + 1, end_index) });
					// 够300条就写入csv文件 批处理
					if (list.size() == 300) {
						writeCSV(list, csvResultPath);
						list.clear();
					}
				}
			}
			conn = null;
		}
		br.close();
		bw.close();
		return list;
	}

	//
	private static void writeCSV(List<String[]> list, String csvFilePath) {
		try {
			/*CsvReader csvWriter = new CsvReader(csvFilePath, ' ', Charset.forName("GBK"));
			csvWriter.getValues();*/
			// 创建CSV写对象 例如:CsvWriter(文件路径，分隔符，编码格式);
			CsvWriter csvWriter = new CsvWriter(csvFilePath, ',', Charset.forName("GBK"));
			// 写表头
			/*
			 * String[] csvHeaders = { "text", "Url" };
			 * csvWriter.writeRecord(csvHeaders);
			 */
			// 写内容
			/*
			 * ListIterator it = list.listIterator(); while(it.hasNext()){
			 * csvWriter.writeRecord((String[])it.next()); }
			 */
			for (String[] strings : list) {
				csvWriter.writeRecord(strings);
			}
			csvWriter.close();
			System.out.println("--------CSV文件已经写入--------");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
