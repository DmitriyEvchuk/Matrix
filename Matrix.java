import static ua.dima.Aprint.*;
import java.util.*;

public class Matrix{
public Integer [][]matrix1;
public Integer [][]matrix2;
  	    
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

		Matrix matrix=new Matrix(3,4,4,3);  //input size first and second matrix
		SumMatrix summatrix=new SumMatrix();
        
		printMatrix(matrix.matrix1);
		printMatrix(matrix.matrix2);
        	printMatrix(summatrix.sum(matrix.matrix1,matrix.matrix2));
		
	
	
	}//main 
    
	}//class

class SumMatrix
		{

public Integer [][]rezMatrix;

private Integer [][]buffMatrix1;
private Integer [][]buffMatrix2;
 	
	public Integer[][] sum(Integer [][] matrix1,Integer [][] matrix2 ){
		
		//init and fill buffMatrix1,buffMatrix2. rezMatrix only init 
		fillRezBuffMtr(matrix1,matrix2); 
		
		for(int i = 0; i<rezMatrix.length; i++){
	
		  for(int j = 0; j<rezMatrix[i].length; j++){			
	    	
		  rezMatrix[i][j]=buffMatrix1[i][j]+buffMatrix2[i][j]; 
		
		  }//for j
		
		}//for i
               	
		return rezMatrix;	
		
		}//sum


	private void fillRezBuffMtr(Integer[][] matrix1,Integer[][]matrix2){
		
		int rowsRezMatrix=0;
		int columnsRezMatrix=0;
		
		// get size for rezMatrix,buffMatrix1,buffMatrix2
		if(matrix1.length>=matrix2.length){
		  rowsRezMatrix=matrix1.length;} 
		else
		  {rowsRezMatrix=matrix2.length;}

		if(matrix1[0].length>=matrix2[0].length){
		  columnsRezMatrix=matrix1[0].length;}    
		else
		  {columnsRezMatrix=matrix2[0].length;}
		
		//init matrix
		rezMatrix=new Integer[rowsRezMatrix][columnsRezMatrix];

		buffMatrix1=new Integer[rowsRezMatrix][columnsRezMatrix];
		buffMatrix2=new Integer[rowsRezMatrix][columnsRezMatrix];
	
		//fill buffMatrix1 
		for (int i=0;i<rowsRezMatrix ;i++ )
		{
		  for (int j=0;j<columnsRezMatrix;j++)
		{
		    if ((matrix1.length>i)&&(matrix1[0].length>j))
			buffMatrix1[i][j]=matrix1[i][j];
		    else
			buffMatrix1[i][j]=0; 
		
		}//for j  
		

		}//for i
	  
		//fill buffMatrix2 
		for (int i=0;i<rowsRezMatrix ;i++ )
		{
		  for (int j=0;j<columnsRezMatrix;j++)
		{
		   if ((matrix2.length>i)&&(matrix2[0].length>j))
			buffMatrix2[i][j]=matrix2[i][j];
		   else
			buffMatrix2[i][j]=0;

		 
		}//for j  
		
		}//for i
	  
		
		
		}//initmatr

































}//class