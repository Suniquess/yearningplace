package com.go;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ClearEmptyLine {
	private static String filename1;
	private static String filename2;

	public static void clearEmpty() {
		filename1 = "D:/爬虫连接/strategyImgURLResult.txt";
		filename2 = "D:/爬虫连接/strategyImgURLResult-back.txt";
		File file = new File(filename1);
		InputStream is = null;
		BufferedReader br = null;
		String tmp;
		FileWriter writer = null;
		int i = 0;
		try {
			is = new BufferedInputStream(new FileInputStream(file));
			br = new BufferedReader(new InputStreamReader(is, "GBK"));
			writer = new FileWriter(filename2, true);
			while ((tmp = br.readLine()) != null) {
				if (tmp.equals(""))
					;
				else {
					writer.write(tmp + System.getProperty("line.separator"));
					i++;
					System.out.println(i);
				}
			}
			writer.close();
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}