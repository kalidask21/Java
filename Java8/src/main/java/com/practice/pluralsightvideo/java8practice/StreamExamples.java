package com.practice.pluralsightvideo.java8practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamExamples {

	private void groupByWordCount(List<Words> words) {
		
		Function<String,Integer> flatmap = word -> word.length();  
//		
//		Map<Integer,List<Words>> hm = words.stream()
//				 .flatmap(flatmap)
//				 .filter(count ->count > 7)
//				 .collect(Collectors.groupingBy(
//						   word
//				  ));
//		
		
	}
	
	
	public static void main(String[] args) {

		Stream<String> s1 = Stream.of("A", "B", "C");
		Stream<String> s2 = Stream.of("D", "E", "F");
		Stream<Integer> s3 = Stream.of(1, 2, 3, 4);
		
		LongStream longStr = LongStream.of(10L,41L);
		
		longStr.sorted();
		
		IntStream intStr = IntStream.of(2,4,5,6,7,8,9,13,10);
		
		//System.out.println(intStr.summaryStatistics());

		Stream<String> out = Stream.concat(s1, s2);
		
		// Special streams

		//readStreamFromFile();
		 readDictionaryFromFile();
		 
		 
		 
	}
	
	private static List<Words> readDictionaryFromFile() {
		
		   Path path1 = Paths.get("C:\\PerDev\\git\\Java\\dictionaryservice\\src\\main\\resources\\dictionary.json");  
		   
		   try( Stream<String> file1 = Files.lines(path1)){
			   
			   System.out.println(Integer.MAX_VALUE);
			   Stream<Stream<String>> streamOfStreams = Stream.of(file1);
			   Stream<String> streams = streamOfStreams.flatMap(Function.identity());
			   Function<String,Stream<String>> splitwords = line -> Pattern.compile("[\"][,][\"]").splitAsStream(line); 
			   
			   Stream<String> words = 
					      streams.parallel()
					      .flatMap(splitwords)
					      .map(lines -> lines.replace("\"","").toLowerCase())
					      .filter(lines -> lines.split(":")[0].equals("reason"));
					      
			   List<Words> listWords = words.map(lines -> new Words(lines.split(":")[0],lines)).collect(Collectors.toList());
			   //List<String> listWords = words.collect(Collectors.toList());		      
//			   listWords.forEach((word) ->{
//				   System.out.println(word.toString());
//			   });
//			   System.out.println("listWords :"+listWords.size());
			   return listWords;
			
		   } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return null;
		   
	   }

	private static void readStreamFromFile() {
	   Path path1 = Paths.get("C:\\apps\\streams\\EM1.txt");  
	   Path path2 = Paths.get("C:\\apps\\streams\\EM2.txt");  
	   Path path3 = Paths.get("C:\\apps\\streams\\EM3.txt");  
	   Path path4 = Paths.get("C:\\apps\\streams\\EM4.txt");
	   
	   try(    Stream<String> file1 = Files.lines(path1);
			   Stream<String> file2 = Files.lines(path2);
			   Stream<String> file3 = Files.lines(path3);
			   Stream<String> file4 = Files.lines(path4);
		   ){
		   
//		   System.out.println("File 1: Size is "+file1.count());
//		   System.out.println("File 2: Size is "+file2.count());
//		   System.out.println("File 3: Size is "+file3.count());
//		   System.out.println("File 4: Size is "+file4.count());
//		   
		   Stream<Stream<String>> streamOfStreams = Stream.of(file1,file2,file3,file4);
		   
		   Stream<String> streams = streamOfStreams.flatMap(Function.identity());
		   
		   //System.out.println("total file: Size is "+streams.count());

		   Function<String,Stream<String>> splititerator = line -> Pattern.compile(" ").splitAsStream(line); 
		   
		   //System.out.println("total uniquwWord : Size is "+streams.flatMap(splititerator).count());
		   
		   Stream<String> ElonWords = streams.flatMap(splititerator)
				     .map(lines -> lines.toLowerCase())
				     .distinct()
				     .filter(lines -> lines.contains("tesla"));
		   
		   ElonWords.forEach(System.out::println);
		   
		   //System.out.println("Elon times is "+ElonWords.count());
		   
		
	   } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
}
