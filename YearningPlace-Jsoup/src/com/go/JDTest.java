package com.go;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class JDTest {
	@Test
	public void test01() throws IOException{
		String url="https://you.ctrip.com/travels/xiamen21/3904229.html";
		Connection conn = Jsoup.connect(url);
		// 获取整个网页内容
		Document doc = conn.get();
		Elements els = doc.select(".img_blk img");
		Element el = els.get(0);
		System.out.println(el.outerHtml());
		/*for (Element ele : els) {
			String date = ele.text();
			System.out.println(date);
		}*/
	}
	private Logger logger = Logger.getLogger(JDTest.class);
	@Test
	public void test03() throws IOException{
		FileOutputStream fos = new FileOutputStream(new File("e://Jsoup Results/result.txt"));
		final String LINE_SEPARATOR = System.getProperty("line.separator");
		String url = "https://list.jd.com/list.html?cat=9987,653,655&page=1";
		Connection conn = Jsoup.connect(url);
		Document doc = conn.get();
		Elements els = doc.select(".p-skip em b");
		// 获取总共有多少页
		int pageNum = Integer.parseInt(els.get(0).text());
		System.out.println(pageNum);
		
		for(int page =1;page<=pageNum;page++){
			String urlNow = "https://list.jd.com/list.html?cat=9987,653,655&page="+page;
			conn=Jsoup.connect(urlNow);
			doc=conn.get();
			els=doc.select(".p-name em");
			for (Element ele : els) {
				logger.info(ele.text()+LINE_SEPARATOR);
				fos.write((ele.text()+LINE_SEPARATOR).getBytes());
				System.out.println(ele.text());
			}
		}
		fos.flush();
		fos.close();
	}
}
