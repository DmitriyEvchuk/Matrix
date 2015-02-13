import java.io.*;

public class ImplementWordsExtraction implements WordsExtractor
{
private String [] words;  



	private int getWordsArrSize(String data){

	StringBufferInputStream string= new StringBufferInputStream(data);

	char last=0;
	int size=0;
	int z=string.available();	
	boolean x=true;
	for (int i=0;i<z ;i++ )
	{
	
		char val=(char)string.read();


		//if apostrophe
		if (val==39){//4
			
			//if letter	
			if(Character.isLetter(last)){//5
		
			 x=true;
		}//5

		}//4



		if(val!=39){//if3
		
		//if letter
		if (Character.isLetter(last))
		{
			//if somsing else
		 	 if(!Character.isLetter(val)){
		
		  size++;
		  x=false;
		
		}//if2
		
		}//if1

		
		//exclusion apostrophe
  
		if((x==true)&&(last==39)&&(!Character.isLetter(val))){//6
			
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
	int indx=0;
	String toArray=new String("");
	char last=0;
	Boolean x=new Boolean(false);
	
	for (int i=0;i<z ;i++ )
	{
	  
		char val=(char)string.read();

		//if apostrophe
		if (val==39){//4
			
			//if letter	
			if(Character.isLetter(last)){//5
		
			Character ch1=(char)val;
			toArray=toArray+ch1.toString();
			 x=true;
		}//5

		}//4

		
		// if all cases except for the apostrophe
		if(val!=39){//if3
		
		//if letter
		if(Character.isLetter(val)){
		
		
		Character ch=(char)val;
		String buf=ch.toString();
		toArray=toArray+buf;		
		words[indx]=toArray;
		
	
		}//if0
		
		//if letter
		if (Character.isLetter(last))
		{
			//if somsing else
		 	 if(!Character.isLetter(val)){
		
		  indx++;
		  toArray="";
		x=false;
		
		}//if2
		
		}//if1
		
		//exclusion apostrophe
		if((x==true)&&(last==39)&&(!Character.isLetter(val))){//6
			
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