

public class MatrixHelper
	{
	public static Matrix sumMatrix(Matrix matrix1,Matrix matrix2){


	Matrix summatrix=new Matrix(matrix1.compareRowsMatrix(matrix2),matrix1.compareColsMatrix(matrix2));
    	
		int a,b;
	
		for(int i = 0; i<summatrix.getRowsLength(); i++){
	
		  for(int j = 0; j<summatrix.getColsLength(); j++){			
	    	
		  	 a=0;
			 b=0;
			
			if (i<matrix1.getRowsLength())
			{
			  if (j<matrix1.getColsLength())
			  {
			    a=matrix1.getMatrixVal(i,j);
			  }
				
			}//if

			
			if (i<matrix2.getRowsLength())
			{
			  if (j<matrix2.getColsLength())
			  {
			    b=matrix2.getMatrixVal(i,j);
			  }
				
			}//if

			summatrix.setMatrixVal(i,j,a+b);
			
			
		}//for j
		
		}//for i

		return summatrix;

	}//sumMatrix

  

	public static Matrix minusMatrix(Matrix matrix1,Matrix matrix2){


	Matrix minusmatrix=new Matrix(matrix1.compareRowsMatrix(matrix2),matrix1.compareColsMatrix(matrix2));
    	
		int a,b;

		for(int i = 0; i<minusmatrix.getRowsLength(); i++){
	
		  for(int j = 0; j<minusmatrix.getColsLength(); j++){			
	    	
		         a=0;
			 b=0;
			
			if (i<matrix1.getRowsLength())
			{
			  if (j<matrix1.getColsLength())
			  {
			    a=matrix1.getMatrixVal(i,j);
			  }
				
			}//if

			
			if (i<matrix2.getRowsLength())
			{
			  if (j<matrix2.getColsLength())
			  {
			    b=matrix2.getMatrixVal(i,j);
			  }
				
			}//if

			minusmatrix.setMatrixVal(i,j,a-b);			
		}//for j
		
		}//for i

	
		return minusmatrix;

	}//sumMatrix


	

	public static Matrix multiplyMatrix(Matrix matrix1,Matrix matrix2){


		Matrix multirlymatrix=new Matrix(matrix1.compareRowsMatrix(matrix2),matrix1.compareColsMatrix(matrix2));
    		
		int a,b;
		
		for(int i = 0; i<multirlymatrix.getRowsLength(); i++){
	
		  for(int j = 0; j<multirlymatrix.getColsLength(); j++){			
	    	
			a=0;
			b=0;
			
			if (i<matrix1.getRowsLength())
			{
			  if (j<matrix1.getColsLength())
			  {
			    a=matrix1.getMatrixVal(i,j);
			  }
				
			}//if

			
			if (i<matrix2.getRowsLength())
			{
			  if (j<matrix2.getColsLength())
			  {
			    b=matrix2.getMatrixVal(i,j);
			  }
				
			}//if

			multirlymatrix.setMatrixVal(i,j,a*b);
			
		}//for j 
		
		}//for i
		
		
		
		return multirlymatrix;

	}//sumMatrix



	public static Matrix transport(Matrix matrix){

		//not error if matrix different size
		
		Matrix transport=new Matrix(matrix.getColsLength(),matrix.getRowsLength());
    	
		for(int i = 0; i<matrix.getRowsLength(); i++){
	
		  for(int j = 0; j<matrix.getColsLength(); j++){

		      transport.setMatrixVal(j,i,matrix.getMatrixVal(i,j));

		}//for j
		 }//for i

			return transport;

		}//sumMatrix





	}//class