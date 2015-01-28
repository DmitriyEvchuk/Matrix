

public class MatrixHelper
	{
private  Matrix rezmatrix;	
	

	MatrixHelper(Matrix rezmatrix1){

		rezmatrix=rezmatrix1;

		

	}


	public  Matrix sumMatrix(Matrix matrix1,Matrix matrix2){

	rezmatrix.createMatrix(matrix1.compareRowsMatrix(matrix2),matrix1.compareColsMatrix(matrix2));
	
	
	 for(int i = 0; i<rezmatrix.getRowsLength(); i++){
	
		  for(int j = 0; j<rezmatrix.getColsLength(); j++){			
	    	
		  	
			rezmatrix.setMatrixVal(i,j,getValtoEnd(matrix1,i,j)+getValtoEnd(matrix2,i,j));
			
			
		}//for j
		
		}//for i

		return rezmatrix;

	}//sumMatrix

  

	public  Matrix minusMatrix(Matrix matrix1,Matrix matrix2){
	
	rezmatrix.createMatrix(matrix1.compareRowsMatrix(matrix2),matrix1.compareColsMatrix(matrix2));


	for(int i = 0; i<rezmatrix.getRowsLength(); i++){
	
		  for(int j = 0; j<rezmatrix.getColsLength(); j++){			
	    	
		         rezmatrix.setMatrixVal(i,j,getValtoEnd(matrix1,i,j)-getValtoEnd(matrix2,i,j));			
		}//for j
		
		}//for i

	
		return rezmatrix;

	}//sumMatrix


	

	public  Matrix multiplyMatrix(Matrix matrix1,Matrix matrix2){


		rezmatrix.createMatrix(matrix1.compareRowsMatrix(matrix2),matrix1.compareColsMatrix(matrix2));	
		               
    		
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


































	}//class