
import java.util.*;


public class Matrix{
private Integer []matrix;
private int rowsSize;
private int colsSize;
				
												  	    
	
	// init matrix
	public Matrix(int rowsMatrixSize,int columnsMatrixSize ){ 
        
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

		int val=matrix[(row*colsSize)+col];
		
		return  val;
		
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
        
			


		public Integer getValtoEnd(int row ,int col){
            
			int a=0;
			
			if (row<getRowsLength())
			{
			  if (col<getColsLength())
			  {
			    a=getMatrixVal(row,col);
			  }
				
			}//if
			return a;
		}
	

	public static void main(String []args) {

        	Matrix matrix1=new Matrix(3,4);
		Matrix matrix2=new Matrix(6,5);
		
		matrix1.setMatrixRandom();
		matrix1.printMatrixV();
		
		matrix2.setMatrixRandom();
	        matrix2.printMatrixV();
		
		
		System.out.println("SUM");
		MatrixHelper.sumMatrix(matrix1,matrix2).printMatrixV();
		
		System.out.println("MINUS");
		MatrixHelper.minusMatrix(matrix1,matrix2).printMatrixV();

		System.out.println("MULTIPLY");
		MatrixHelper.multiplyMatrix(matrix1,matrix2).printMatrixV();
			
		
		System.out.println("TRANSPORT MATRIX1");
		MatrixHelper.transport(matrix1).printMatrixV();
	       
	
	
	}//main 
    
	










	}//class

