import java.io.*;

public class ImplementWordsExtraction implements WordsExtractor
{
private String [] words;  



	private int getWordsArrSize(String data){

	StringBufferInputStream string= new StringBufferInputStream(data);

	int last=0;
	int size=0;
	int z=string.available();	
	boolean x=true;
	for (int i=0;i<z ;i++ )
	{
	
		int val=string.read();


		//if apostrophe
		if (val==39){//4
			
			//if letter	
			if(((last>=65)&&(last<=90)||(last>=97)&&(last<=122))){//5
		
			 x=true;
		}//5

		}//4



		if(val!=39){//if3
		
		//if letter
		if (((last>=65)&&(last<=90)||(last>=97)&&(last<=122)))
		{
			//if somsing else
		 	 if((val<65)||((val>90)&&(val<97))||(val>122)){
		
		  size++;
		  x=false;
		
		}//if2
		
		}//if1

		
		//exclusion apostrophe
  
		if((x==true)&&(last==39)&&((val<65)||((val>90)&&(val<97))||(val>122))){//6
			
			size++;
		 	 
			x=false;
		
		}//if6
		}//if3
		
			
				
		 
	last=val;
	

	}//for
	

		return size;
	
	}//getWordsArrSize


	


	public void parseString(String data){

	StringBufferInputStream string= new StringBufferInputStream(data);

	words=new String[getWordsArrSize(data)];
	
	int z=string.available();	
	Integer indx=new Integer(0);
	String toArray=new String("");
	int last=0;
	Boolean x=new Boolean(false);
	
	for (int i=0;i<z ;i++ )
	{
	  
		int val=string.read();

		//if apostrophe
		if (val==39){//4
			
			//if letter	
			if(((last>=65)&&(last<=90)||(last>=97)&&(last<=122))){//5
		
			Character ch1=(char)val;
			toArray=toArray+ch1.toString();
			 x=true;
		}//5

		}//4

		
		// if all cases except for the apostrophe
		if(val!=39){//if3
		
		//if letter
		if((val>=65)&&(val<=90)||(val>=97)&&(val<=122)){
		
		
		Character ch=(char)val;
		String buf=ch.toString();
		toArray=toArray+buf;		
		words[indx]=toArray;
		
	
		}//if0
		
		//if letter
		if (((last>=65)&&(last<=90)||(last>=97)&&(last<=122)))
		{
			//if somsing else
		 	 if((val<65)||((val>90)&&(val<97))||(val>122)){
		
		  indx++;
		  toArray="";
		x=false;
		
		}//if2
		
		}//if1
		
		//exclusion apostrophe
		if((x==true)&&(last==39)&&((val<65)||((val>90)&&(val<97))||(val>122))){//6
			
			indx++;
		 	 toArray="";
			x=false;
		
		}//if6
		}//if3
		
		
		
		last=val;

	}//for

	};//parse

	
	


	public int getWordsCount(){

		int count=words.length;
		return count;
	};//getWordsCount
	
	


	public String[] getWords(){

	
		String buf[]=new String[getWordsCount()];
	
		 for(int i=0;i<getWordsCount();i++)
	
		  buf[i]=words[i];


	  	return buf;
	};//getWords
	
			

	






















};//clas