package com.actitime.mock1;

import java.io.FileInputStream;//[7th]question
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commandata.property");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String username=p.getProperty("un");
		String pwd=p.getProperty("pwd");
	    System.out.println(url);
	    System.out.println(username);
	    System.out.println(pwd);	    
	}
	
}
