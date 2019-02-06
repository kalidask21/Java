package com.practice.algorithm.practice;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringClass {

	private static String SortString(String input) {
		char[] stringArray = input.toCharArray();
		Arrays.sort(stringArray);
		String s1 = new String(stringArray).toLowerCase();
		System.out.println(s1);
		return s1;
	}

	private static void isAnagram(String s1, String s2) {
		if (s1.equals(s2))
			System.out.println("Its Anagaram");
		else
			System.out.println("Its not anagram");
	}

	private static void replaceContentLogic(String sentence, String src, String dest) {
		sentence = sentence.replace(src, dest);
		System.out.println(sentence);

	}

	public static void main(String[] args) {
		System.out.println();
		replaceContentLogic("Hey Kalidas how your doing,Your fullname is Kalidas Kanniappan , am i Right ?", "Kalidas",
				"Balaji");

		// System.out.println("Kalidas".split("al"));
		/// for(String s :"Kalidas".split("al"))
		// System.out.println(s);

		// String s1 = SortString("kalidas");
		// String s2 = SortString("kalsida");
		// isAnagram(s1,s2);

		// removeUnderScore("Kalidas_Kanniappan_MR");
		// String val = null;
		// val = "test";
		// System.out.println(isEmpty(val));
		
		System.out.println(giveRotationString("JavaJ2eeStrutsHibernate","JavaJ2eeStrutsHibernate"));
	}

	public static String removeUnderScore(String s) {
		StringBuffer sbf = new StringBuffer();
		StringTokenizer strToke = new StringTokenizer(s, "_");
		int count = -1;
		while (strToke.hasMoreTokens()) {
			sbf.append(" ");
			sbf.append(strToke.nextToken());
			count++;
		}
		System.out.println("UnderScore count is " + count);
		System.out.println("removeunderScore : " + sbf.toString());
		return sbf.toString();

	}

	public static boolean isEmpty(final CharSequence cs) {
		return cs == null || cs.length() == 0;
	}

	static boolean giveRotationString(String str1, String str2) {
		for (char c : str1.toCharArray()) {
			if (str2.indexOf(c) == -1) {
				return false;
			}
		}
		return true;
	}

}
