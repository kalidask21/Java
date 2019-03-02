package com.practice.thread.readfile.concurrently;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReader {

	 public static void main(String[] args) throws Exception {
		//readerObj.
		 Reader.readFileByNIO("C:\\apps\\", "DG.txt").forEach(System.out::println);
	}
	
	public static class Reader {
		
		public static void readFileByIO(String path,String file) throws Exception{
			  File fileObj = new File(path+file); 
			 try(BufferedReader br = new BufferedReader(new java.io.FileReader(fileObj))) {
				 String ln = null;
				 while((ln = br.readLine()) != null) {
					 System.out.println("IO :"+ln);
				 }
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		public static List<String> readFileByNIO(String path,String file) throws Exception{
			  Path pathReader =  Paths.get(path, file);
			  Stream<String> output =  Files.lines(pathReader);
			  try (BufferedReader br = Files.newBufferedReader(pathReader)){
				  while(br.readLine() != null) {
					  System.out.println(br.readLine());
				  }
				  
			  } catch (Exception e) {
			  		// TODO: handle exception
			  }
			  
			  System.out.println( " -- File info --  ");
			  
			  if(!Files.exists(pathReader))
				  throw new FileNotFoundException( "File not found on "+path);
			  
			  System.out.println(Files.isReadable(pathReader));
			  System.out.println(Files.isWritable(pathReader));
			  System.out.println(Files.isHidden(pathReader));
			  System.out.println(Files.exists(pathReader));
			  
			  Pattern pat = Pattern.compile("^[0-9]");
			  List<String> lines = output.filter(content -> pat.matcher(content).find()).collect(Collectors.toList());
			  output.close();
			  return lines;
		}
	}	
}



