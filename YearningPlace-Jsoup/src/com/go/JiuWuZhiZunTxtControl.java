package com.go;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JiuWuZhiZunTxtControl {
	public static void main(String[] args) throws IOException {
		String txtUrl = "D:/爬虫连接/小说爬虫连接/jiuwuzhizun.txt";
		BufferedReader br = new BufferedReader(new FileReader(new File(txtUrl)));
		for(int i=0;i<10;i++)
			System.out.println(br.readLine());
		br.close();
	}
	
}
