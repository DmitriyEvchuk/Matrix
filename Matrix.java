
import java.util.*;

public class Matrix{
private Integer [][]matrix1;
private Integer [][]matrix2;
  	    
	//if you need empty referense on matrix
	public Matrix(){}	
	
	// if you need only one random matrix
	public Matrix(int rowsFirstMatrix,int columnsFirstMatrix ){ 
          
        	Random random = new Random();
              
		matrix1=new Integer[rowsFirstMatrix][columnsFirstMatrix];
		    
              //fill  matrix1
		for (int i=0;i<rowsFirstMatrix ;i++ )
             	{
              	  for (int j=0;j<columnsFirstMatrix ;j++ )  
             	  {
             	  matrix1[i][j]=random.nextInt(100);
              	  }//for j
             
             	  }//for i

	
	}//constructor   
         
	// if you need two random matrix
	public Matrix(int rowsFirstMatrix,int columnsFirstMatrix,int  rowsSecondMatrix,int columnsSecondMatrix ){ 
          
        	Random random = new Random();
              
		matrix1=new Integer[rowsFirstMatrix][columnsFirstMatrix];
		matrix2=new Integer[rowsSecondMatrix][columnsSecondMatrix];    
              
	//fill first matrix1
		for (int i=0;i<rowsFirstMatrix ;i++ )
             	{
              	  for (int j=0;j<columnsFirstMatrix ;j++ )  
             	  {
             	  matrix1[i][j]=random.nextInt(100);
              	  }//for2
             
             	  }//for1

	//fill second matrix2 if the matrix size is different  
		for (int i=0;i<rowsSecondMatrix ;i++ )
             	{
              	   for (int j=0;j<columnsSecondMatrix ;j++ )  
             	   {
             	    matrix2[i][j]=random.nextInt(100);
                   }//for j
             
             	   }//for i


	}//constructor

	//inizialization matrix for matrix1
	protected void setMatrix(Integer [][] value){//for example setMatrix(new Integer[3][3]) 
		matrix1=value;}

	//set matrix1
	protected Integer [][] setMatrix(){return matrix1;}  //????????????????????????????

	//get matrix1
	public Integer getMatrix(int i,int j){
		
		int value=matrix1[i][j];
		return value;}
	
	
	public Integer getRowsMatrixLength(){
		
		int length1=matrix1.length;	
		return length1;	}

	public Integer getColumnsMatrixLength(){

		int length1=matrix1[0].length;	
		return length1;	}


	

	//inizialization matrix for matrix2
	 protected void setMatrix2(Integer [][] value){
		matrix2=value;}

	//set matrix2
	 protected void setMatrix2(int i,int j,int value){    //????????????????????????????
		matrix2[i][j]=value;}

	//get matrix2
	public Integer getMatrix2(int i,int j){

		int value=matrix2[i][j];
		return value;}
	
	public Integer getRowsMatrix2Length(){
		
		int length2=matrix2.length;	
		return length2;	}

	public Integer getColumnsMatrix2Length(){

		int length2=matrix2[0].length;	
		return length2;	}



	public static void printMatrix (Integer [][] matrix){

	for(int i = 0; i<matrix.length; i++){
	
		for(int j = 0; j<matrix[i].length; j++){			
	    	
		 System.out.print(matrix[i][j] + " ");
		
		  }//for2
		
		   System.out.println();
		
		   }//for1
		
		System.out.println();


	}//showMatrix
        
        

	public static void main(String []args) {

		Matrix matrix1=new Matrix(3,4);  //input size first  matrix
		Matrix matrix2=new Matrix(4,3);  //input size second  matrix
		
		SumMatrix summatrix=new SumMatrix();
        
		printMatrix(matrix1.matrix1);
		printMatrix(matrix2.matrix1);
        	printMatrix(summatrix.sum(matrix1,matrix2).matrix1);
		
	
	
	}//main 
    
	}//class

