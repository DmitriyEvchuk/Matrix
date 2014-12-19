
import java.util.*;

public class Matrix{
private Integer [][]matrix;

  	    
	//if you need empty referense on matrix
	public Matrix(){}	
	
	// if you need only one random matrix
	public Matrix(int rowsFirstMatrix,int columnsFirstMatrix ){ 
          
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
         
	

	//get matrix if you want to sheet in my matrix sheet in clone (:
	public Integer[][] getMatrix(){
		
		Integer clone[][]=new Integer[matrix.length][matrix[0].length]; 
		
		for (int i=0;i<matrix.length ;i++ )
             	{
              	  for (int j=0;j<matrix[0].length ;j++ )  
             	  {
             	  clone[i][j]=matrix[i][j];
              	  }//for j
             
             	  }//for i

		return clone;}
	
	

	protected void setMatrixVal(int row,int col,int value){    
		matrix[row][col]=value;}

	//inizialization matrix for matrix
	protected void setMatrix(Integer [][] value){//for example setMatrix(new Integer[3][3]) 
		matrix=value;}

	

	
	//now this method work for object
	public  void printMatrix (){

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
        
		matrix1.printMatrix();
		matrix2.printMatrix();
        summatrix.sum(matrix1,matrix2).printMatrix();
		
	
	
	}//main 
    
	}//class



	
	
	

	
