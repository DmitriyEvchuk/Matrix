

import java.util.*;


public class Matrix{
private Integer []matrix;

																																				  	    
	
	// init matrix
	public Matrix(int rowsMatrixSize,int columnsMatrixSize ){ 
          
        	initMatr(rowsMatrixSize,columnsMatrixSize);
		
		
	
	}//constructor   
         
	public void initMatr(int rowsMatrixSize,int columnsMatrixSize){
	
		int sizeMass=(rowsMatrixSize*columnsMatrixSize)*3;
	
		matrix=new Integer[sizeMass];

		int row=0;
		int col=0;		

		for(int i=0;i<matrix.length;i++){

		
		if((i%3)==0)
		
		  {matrix[i]=0;}
                  
		  i++;
		
		if(row<rowsMatrixSize)
		   
		   {matrix[i]=row;
		    }//if
		
		if(row>=rowsMatrixSize)
		   
		   {row=0;}
		 
		    i++;
		
		if(col<columnsMatrixSize){
		    
		     matrix[i]=col;
		     col++;}//if
		
		if(col>=columnsMatrixSize)
		      
		     {col=0;
		     row++;}
		
		


	}//for
	}//initMatr

	
	public void setMatrixVal(int row,int col,int val){

		int indx=0;
		for (int i=0;i<matrix.length ;i++ )
		{
		 if((i%3)==0)  
		  { indx=i;
		    i++;
		
		if(matrix[i]==row){
		   
		   i++;
		    
		if(matrix[i]==col){
		
		   matrix[indx]=val;
		  
		}//if col

		}//if row
		   
	 	}// if i%3
		
		}//for	
	



	}//setMatrixVal

	public Integer getMatrixVal(int row,int col){

		int val=0;
		int indx=0;

		for (int i=0;i<matrix.length ;i++ )
		{
		 if((i%3)==0)  
		  
		  {indx=i;
		    i++;
		
		if(matrix[i]==row){
		   
		   i++;
		    
		if(matrix[i]==col){
		
		  val=matrix[indx];
		  
		}//if col

		}//if row
		   
	 	}//if i%3
		
		}//for	
		

		  return val;
		
		}//getMatrixVal
	
	
	public Integer getRowsLength(){
		
		int sizeRows=matrix[matrix.length-2]+1;
		
		return sizeRows;
	}//getRowsLength

	

	public Integer getColsLength(){
		
		int sizeCols=matrix[matrix.length-1]+1;
		
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
        
	//only for test
	public Integer [][] virtMatrToMatr(){

		Integer matrixReal[][]=new Integer[getRowsLength()][getColsLength()];

		for (int i=0;i<getRowsLength() ;i++ )
		{
		  for (int j=0;j<getColsLength() ;j++ )
		  {
		    
		  matrixReal[i][j]=getMatrixVal(i,j);
		  
		  }//for j
		}//for i
	
		return matrixReal;		

		}//virtMatrToMatr

	
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
        

	

	public static void main(String []args) {

        	Matrix matrix1=new Matrix(5,2);
		Matrix matrix2=new Matrix(3,6);
		
		matrix1.setMatrixRandom();
		matrix1.printMatrixV();
		
		matrix2.setMatrixRandom();
	    matrix2.printMatrixV();
		
		
		System.out.println("SUM");
		MatrixHelper.sumMatrix(matrix1,matrix2).printMatrixV();
		
		System.out.println("MINUS");
		MatrixHelper.minusMatrix(matrix1,matrix2).printMatrixV();

		System.out.println("MULTIPLY");
		MatrixHelper.multiplyMatrix(matrix1,matrix2);//.printMatrixV();
			
		
		System.out.println("TRANSPORT MATRIX1");
		MatrixHelper.transport(matrix1).printMatrixV();
	       

		
	
	}//main 
    
	










	}//class

