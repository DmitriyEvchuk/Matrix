

public class MatrixHelper
	{
private  Matrix rezmatrix;	
	

	MatrixHelper(Matrix rezmatrix1){

		rezmatrix=rezmatrix1;

		

	}


	public  Matrix sumMatrix(Matrix matrix1,Matrix matrix2){

	rezmatrix.createMatrix(compareRowsMatrix(matrix1,matrix2),compareColsMatrix(matrix1,matrix2));
	
	
	 for(int i = 0; i<rezmatrix.getRowsLength(); i++){
	
		  for(int j = 0; j<rezmatrix.getColsLength(); j++){			
	    	
		  	
			rezmatrix.setMatrixVal(i,j,getValtoEnd(matrix1,i,j)+getValtoEnd(matrix2,i,j));
			
			
		}//for j
		
		}//for i

		return rezmatrix;

	}//sumMatrix

  

	public  Matrix minusMatrix(Matrix matrix1,Matrix matrix2){
	
	rezmatrix.createMatrix(compareRowsMatrix(matrix1,matrix2),compareColsMatrix(matrix1,matrix2));


	for(int i = 0; i<rezmatrix.getRowsLength(); i++){
	
		  for(int j = 0; j<rezmatrix.getColsLength(); j++){			
	    	
		         rezmatrix.setMatrixVal(i,j,getValtoEnd(matrix1,i,j)-getValtoEnd(matrix2,i,j));			
		}//for j
		
		}//for i

	
		return rezmatrix;

	}//sumMatrix


	

	public  Matrix multiplyMatrix(Matrix matrix1,Matrix matrix2){


		rezmatrix.createMatrix(compareRowsMatrix(matrix1,matrix2),compareColsMatrix(matrix1,matrix2));	
		               
    		
		for(int i = 0; i<rezmatrix.getRowsLength(); i++){
	
		  for(int j = 0; j<rezmatrix.getColsLength(); j++){			
	    	
			rezmatrix.setMatrixVal(i,j,getValtoEnd(matrix1,i,j)*getValtoEnd(matrix2,i,j));
			
		}//for j 
		
		}//for i
		
		
		
		return rezmatrix;

	}//sumMatrix



	public  Matrix transport(Matrix matrix){

		//not error if matrix different size
		rezmatrix.createMatrix(matrix.getColsLength(),matrix.getRowsLength());	
	
              for(int i = 0; i<matrix.getRowsLength(); i++){
	
		  for(int j = 0; j<matrix.getColsLength(); j++){

		      rezmatrix.setMatrixVal(j,i,matrix.getMatrixVal(i,j));

		}//for j
		 }//for i

			return rezmatrix;

		}//transport


		
	private Integer getValtoEnd(Matrix matrix,int row ,int col){
                        int a=0;
			
			if (row<matrix.getRowsLength())
			{
			  if (col<matrix.getColsLength())
			  {
			    a=matrix.getMatrixVal(row,col);
			  }
				
			}//if
			return a;
		}//getValtoEnd


	private Integer compareRowsMatrix(Matrix matrix1,Matrix matrix2){
		
		int largeRows;	
	
		if(matrix1.getRowsLength()>=matrix2.getRowsLength()){
		  largeRows=matrix1.getRowsLength();} 
		else
		  {largeRows=matrix2.getRowsLength();}

		return largeRows;
		}
        

	//this method compare amount cols matrix and return large
	private Integer compareColsMatrix(Matrix matrix1,Matrix matrix2){
	
		int largeCols;	
	
		if(matrix1.getColsLength()>=matrix2.getColsLength()){
		  largeCols=matrix1.getColsLength();} 
		else
		  {largeCols=matrix2.getColsLength();}

		return largeCols;
		}
        
































	}//class