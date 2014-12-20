
class SumMatrix
		{


private int rowsRezMatrix=0;
private int columnsRezMatrix=0;
		
 	
	public Matrix sum(Matrix matrix1,Matrix  matrix2 ){
		
		 
		findSizeRezMatr(matrix1,matrix2); 
		
		Matrix rezMatrix=new Matrix(rowsRezMatrix,columnsRezMatrix);
		
		fillMatrNull(rezMatrix);	
		
		for(int i = 0; i<rezMatrix.getMatrix().length; i++){
	
		  for(int j = 0; j<rezMatrix.getMatrix()[0].length; j++){			
	    	
		  
			if((matrix1.getMatrix().length>i)&&(matrix1.getMatrix()[0].length>j))
		            
			    rezMatrix.setMatrixVal(i,j,matrix1.getMatrix()[i][j]);
			
			if((matrix2.getMatrix().length>i)&&(matrix2.getMatrix()[0].length>j))
		            
                rezMatrix.setMatrixVal(i,j,rezMatrix.getMatrix()[i][j]+matrix2.getMatrix()[i][j]);
			
		}//for j
		
		}//for i
               	
		return rezMatrix;	
		
		}//sum


	private void findSizeRezMatr(Matrix matrix1,Matrix matrix2){
		
		
		// get size for rezMatrix,buffMatrix1,buffMatrix2
		if(matrix1.getMatrix().length>=matrix2.getMatrix().length){
		  rowsRezMatrix=matrix1.getMatrix().length;} 
		else
		  {rowsRezMatrix=matrix2.getMatrix().length;}

		if(matrix1.getMatrix()[0].length>=matrix2.getMatrix()[0].length){
		  columnsRezMatrix=matrix1.getMatrix()[0].length;}    
		else
		  {columnsRezMatrix=matrix2.getMatrix()[0].length;}
		
		}//initmatr


	private void fillMatrNull(Matrix matrix){

		for(int i = 0; i<matrix.getMatrix().length; i++){
	
		  for(int j = 0; j<matrix.getMatrix()[0].length; j++){			
	    	
                 matrix.setMatrixVal(i,j,0);

		}
		}


}



























}//class