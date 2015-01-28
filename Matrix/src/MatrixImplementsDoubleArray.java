
import java.util.*;

public class MatrixImplementsDoubleArray implements Matrix{
private Integer [][]matrix;

  	    
	//if you need empty referense on matrix
	public MatrixImplementsDoubleArray(){}	
	
	// if you need only one random matrix
	public MatrixImplementsDoubleArray(int rowsFirstMatrix,int columnsFirstMatrix ){ 
          
        	Random random = new Random();
              
		matrix=new Integer[rowsFirstMatrix][columnsFirstMatrix];
		    
              //fill  matrix
		for (int i=0;i<rowsFirstMatrix ;i++ )
             	{
              	  for (int j=0;j<columnsFirstMatrix ;j++ )  
             	  {
             	  matrix[i][j]=random.nextInt(100);
              	  }//for j
             
             	  }//for i

	
	}//constructor   
         
	
	public Integer getRowsLength(){return matrix.length;}

	public Integer getColsLength(){return matrix[0].length;}



	public Integer getMatrixVal(int row,int col){
		
		int val=matrix[row][col];
              	  
		return val;
	}
	
	

	public void setMatrixVal(int row,int col,int val){    
		
		matrix[row][col]=val;}

	
	//now this method work for object
	public  void printMatrix (){

	for(int i = 0; i<getRowsLength(); i++){
	
		for(int j = 0; j<getColsLength(); j++){			
	    	
		 System.out.print(matrix[i][j] + " ");
		
		  }//for2
		
		   System.out.println();
		
		   }//for1
		
		System.out.println();


	}//showMatrix



	public void createMatrix(int sizeRow,int sizeCol){
		
		matrix=new Integer[sizeRow][sizeCol];

		for(int i = 0; i<getRowsLength(); i++){
	
		 for(int j = 0; j<getColsLength(); j++){			
	    	
		matrix[i][j]=0;
		
		  }//for2
		
		   
		
		   }//for1
		
		
	}

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
        
        
        

	
	}//class

