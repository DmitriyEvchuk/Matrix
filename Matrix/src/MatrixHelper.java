


public class MatrixHelper
	{
	public static Matrix sumMatrix(Matrix matrix1,Matrix matrix2){


	Matrix summatrix=new Matrix(matrix1.compareRowsMatrix(matrix2),matrix1.compareColsMatrix(matrix2));
    	

	for(int i = 0; i<summatrix.getRowsLength(); i++){
	
		  for(int j = 0; j<summatrix.getColsLength(); j++){			
			//error dont work without my interface need exception handling in interface
		  summatrix.setMatrixVal(i,j,matrix1.getMatrixVal(i,j)+matrix2.getMatrixVal(i,j));
			
		}//for j
		
		}//for i

		return summatrix;

	}//sumMatrix

  

	public static Matrix minusMatrix(Matrix matrix1,Matrix matrix2){


	Matrix minusmatrix=new Matrix(matrix1.compareRowsMatrix(matrix2),matrix1.compareColsMatrix(matrix2));
    	

	for(int i = 0; i<minusmatrix.getRowsLength(); i++){
	
		  for(int j = 0; j<minusmatrix.getColsLength(); j++){			
			//error dont work without my interface need exception handling in interface
			minusmatrix.setMatrixVal(i,j,matrix1.getMatrixVal(i,j)-matrix2.getMatrixVal(i,j));
			
		}//for j
		
		}//for i

	
		return minusmatrix;

	}//sumMatrix


	

	public static Matrix multiplyMatrix(Matrix matrix1,Matrix matrix2){


	Matrix multirlymatrix=new Matrix(matrix1.compareRowsMatrix(matrix2),matrix1.compareColsMatrix(matrix2));
    	

	for(int i = 0; i<multirlymatrix.getRowsLength(); i++){
	
		  for(int j = 0; j<multirlymatrix.getColsLength(); j++){			
	    	//error dont work without my interface need exception handling in interface
			multirlymatrix.setMatrixVal(i,j,matrix1.getMatrixVal(i,j)*matrix2.getMatrixVal(i,j));
			
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