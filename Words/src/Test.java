import java.io.*;
import java.util.*;

abstract class Test
	{
  



	
	public static String fileToString(DataInputStream str ){

		
		String filestr="";
		String s="";	

		try{
		
		while ((s = str.readLine()) != null) {
                
			filestr=filestr+s;
			filestr=filestr+" ";
		
		}
		
		}
		
		catch(IOException e)
	        {}
   		
		
			return filestr;		
		
	}//fileToString


	public static void printWords(WordsExtractor wordsextractor){
		
		for (int i=0;i<wordsextractor.getWordsCount() ;i++ )
		System.out.println(wordsextractor.getWords()[i]);


	}//print




	public static void test(WordsExtractor wordsextractor ){
		
		try{ 

 		FileInputStream in = new FileInputStream("E:\\work\\111.txt");
       		DataInputStream str=new DataInputStream(in);
	
		
		String filestr=fileToString(str);
		
		wordsextractor.parseString(filestr);
		

		}//try

		catch(IOException e)
	        {}
   		
		printWords(wordsextractor);

		



		}//test




	public static void main(String[] args){


	ImplementWordsExtraction words=new ImplementWordsExtraction();
	test(words);

		
































}//main









}//class;