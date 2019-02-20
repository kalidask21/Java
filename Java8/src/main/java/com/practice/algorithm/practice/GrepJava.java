package com.practice.algorithm.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GrepJava {

	private static void findContentInFile(String fileName ,String word) {
		Pattern Pat = Pattern.compile(word);
		File file = new File(fileName);
		try(FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr)){
			String s = null;
			while((s = br.readLine()) != null) {
				Matcher m = Pat.matcher(s);
				if(m.find()) {
					System.out.println("Line contains "+word);
					System.out.println(s);
				}
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	
	public static void main(String[] args) {
		findContentInFile("C:\\apps\\prodclean212Out.txt","whack");
	}
}
