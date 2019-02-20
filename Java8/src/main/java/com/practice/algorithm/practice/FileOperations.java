package com.practice.algorithm.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.net.URLConnection;
import java.util.Base64;

public class FileOperations {

	private static StringBuffer sbfData = new StringBuffer();

	static void WriteFile() {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\apps\\prodclean212Out.txt"))) {
			bw.write(sbfData.toString());
			System.out.println(sbfData.toString());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	static void readFile() {
		File f = new File("C:\\apps\\prodclean212.txt");
		try (BufferedReader b = new BufferedReader(new FileReader(f));) {
			String readLine = "";
			System.out.println("Reading file using Buffered Reader");
			while ((readLine = b.readLine()) != null) {
				String[] strArry = readLine.split(",");
				// 160477858&whack=MembershipParticipationBZB307822801
				// sbfData.append("'").append(readLine).append("',");
				sbfData.append("'http://webprod/Consumer_webUtil_ImplWeb/ConsumerTestHarness?action=whack&consumerid=")
						.append(strArry[0]).append("&whack=MembershipParticipationBZB").append(strArry[1] + "',")
						.append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static final String kuser = "kalika"; // your account name
    static final String kpass = "Rancho@2101"; // your password for the account

    static class MyAuthenticator extends Authenticator {
        public PasswordAuthentication getPasswordAuthentication() {
            // I haven't checked getRequestingScheme() here, since for NTLM
            // and Negotiate, the usrname and password are all the same.
            System.err.println("Feeding username and password for "
               + getRequestingScheme());
            return (new PasswordAuthentication(kuser, kpass.toCharArray()));
        }
    }

    public static void main(String[] args) throws Exception {
    	readFile();
    	WriteFile();
    }
    	
}
