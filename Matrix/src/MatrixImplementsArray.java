
import java.util.*;


public class MatrixImplementsArray implements Matrix{
private Integer []matrix;
private int rowsSize;
private int colsSize;
				

	public MatrixImplementsArray(){}
												  	    
	
	// init matrix
	public MatrixImplementsArray(int rowsMatrixSize,int columnsMatrixSize ){ 
        
		rowsSize=rowsMatrixSize;
		colsSize=columnsMatrixSize;
		int mass=rowsMatrixSize*columnsMatrixSize;  
        	
		matrix=new Integer[mass];
		for (int i=0;i<matrix.length ;i++ )
		{
		  matrix[i]=0;
		}
		
	
	}//constructor   
         
	
	
	public void setMatrixVal(int row,int col,int val){

		
		matrix[(row*colsSize)+col]=val;


	}//setMatrixVal

	public Integer getMatrixVal(int row,int col){

		int val=0;
		
		return  val=matrix[(row*colsSize)+col];
		
		}//getMatrixVal
	
	
	public Integer getRowsLength(){
		
		int sizeRows=rowsSize;
		
		return sizeRows;
	}//getRowsLength

	

	public Integer getColsLength(){
		
		int sizeCols=colsSize;
		
		return sizeCols;
	}//getColsLength


	
	
	
	//now this method work for object
	public  void printMatrixV (){

		for(int i = 0; i<getRowsLength(); i++){
	
		 for(int j = 0; j<getColsLength(); j++){			
	    	
		  System.out.print(getMatrixVal(i,j)+ " ");
		
		  }//for2
		
		   System.out.println();
		
		   }//for1
		
		System.out.println();


	}//showMatrix
        
	
	
	public void setMatrixRandom(){

		Random random = new Random();	
	
		for (int i=0;i<getRowsLength() ;i++ )
		{
		  for (int j=0;j<getColsLength() ;j++ )
		  {
		    
	            setMatrixVal(i,j,random.nextInt(100));
		  
		   } //for j 
		
		}//for i


		}//setMatrixRandom

	//this method compare amount rows matrix and return large
	public Integer compareRowsMatrix(Matrix matrix){
	
		int largeRows;	
	
		if(getRowsLength()>=matrix.getRowsLength()){
		  largeRows=getRowsLength();} 
		else
		  {largeRows=matrix.getRowsLength();}

		return largeRows;
		}
        

	//this method compare amount cols matrix and return large
	public Integer compareColsMatrix(Matrix matrix){
	
		int largeCols;	
	
		if(getColsLength()>=matrix.getColsLength()){
		  largeCols=getColsLength();} 
		else
		  {largeCols=matrix.getColsLength();}

		return largeCols;
		}
        
			

	public void createMatrix(int sizeRow,int sizeCol){
		
		rowsSize=sizeRow;
		colsSize=sizeCol;
		int mass=rowsSize*colsSize;  
        	
		matrix=new Integer[mass];
		for (int i=0;i<matrix.length ;i++ )
		{
		  matrix[i]=0;
		}


		}




		
	


}//class

