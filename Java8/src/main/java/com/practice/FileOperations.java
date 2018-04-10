package com.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {

	
	private static StringBuffer sbfData = new StringBuffer();
	
	static void WriteFile() {
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\FECode\\30078104Final.txt"))) {
			bw.write(sbfData.toString());
			System.out.println(sbfData.toString());

		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
	
	static void readFile() {
		try {

            File f = new File("C:\\FECode\\30078104.txt");
            BufferedReader b = new BufferedReader(new FileReader(f));
            String readLine = "";
            System.out.println("Reading file using Buffered Reader");
            while ((readLine = b.readLine()) != null) {
            	String[] strArry = readLine.split(",");
            	sbfData.append(strArry[1]+strArry[2]+strArry[3]).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public static void main(String[] args) {
		readFile();
		WriteFile();
	}
}
