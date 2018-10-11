package com.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class FileOperations {

	
	private static StringBuffer sbfData = new StringBuffer();
	
	static void WriteFile() {
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\apps\\whackBulkDataOUT.txt"))) {
			bw.write(sbfData.toString());
			System.out.println(sbfData.toString());

		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
	
	static void readFile() {
		try {

            File f = new File("C:\\apps\\whackBulkData.txt");
            BufferedReader b = new BufferedReader(new FileReader(f));
            String readLine = "";
            System.out.println("Reading file using Buffered Reader");
            while ((readLine = b.readLine()) != null) {
            	String[] strArry = readLine.split(",");
            	//160477858&whack=MembershipParticipationBZB307822801
            	// sbfData.append("'").append(readLine).append("',");
                sbfData.append("'http://webprod/Consumer_webUtil_ImplWeb/ConsumerTestHarness?action=whack&consumerid=").
            		append(strArry[0]).
            		append("&whack=MembershipParticipationBZB").append(strArry[1]+"',")
            	   .append("\n");
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
