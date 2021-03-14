package com.go;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import com.csvreader.CsvWriter;

public class TxtToCsv {
	static int count_patch=0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("D:/爬虫连接/strategyImgURLResult-back.txt")));
		CsvWriter csvWriter = new CsvWriter("D:/爬虫连接/csvImgUrlResult.csv", ',', Charset.forName("GBK"));
		String[] csvHeaders = { "text", "Url" };
		csvWriter.writeRecord(csvHeaders);
		List<String[]> list = new ArrayList<>();
		String line="";
		String title="";
		while((line=br.readLine())!=null&&!"".equals(line)){
			if(!line.startsWith("https")){
				title=line;
				continue;
			}else{
				list.add(new String[]{title,line});
			}
			// 批处理
			if(list.size()>=200){
				for (String[] strings : list) {
					csvWriter.writeRecord(strings);
				}
				System.out.println("完成"+(++count_patch)+"批");
				list.clear();
			}
		}
		csvWriter.close();
		br.close();
	}
}
