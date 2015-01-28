abstract public class Test
{
  


  public static void main(String []args) {

		//test for MatrixImplementsArray
        	MatrixImplementsArray matrix1=new MatrixImplementsArray(5,4);
		MatrixImplementsArray matrix2=new MatrixImplementsArray(6,3);
		
		System.out.println("MATRIX1 FOR MatrixImplementsArray");
		matrix1.setMatrixRandom();
		matrix1.printMatrixV();
		
		System.out.println("MATRIX2 FOR MatrixImplementsArray");
		matrix2.setMatrixRandom();
	        matrix2.printMatrixV();
		
		
		MatrixHelper helpermatrix=new MatrixHelper(new MatrixImplementsArray()); 
		
		
		//System.out.println("SUM FOR MatrixImplementsArray");
		//((MatrixImplementsArray)helpermatrix.sumMatrix(matrix1,matrix2)).printMatrixV();
		
		
		System.out.println("MINUS FOR MatrixImplementsArray");
		((MatrixImplementsArray)helpermatrix.minusMatrix(matrix1,matrix2)).printMatrixV();

	
		//System.out.println("MULTIPLY FOR MatrixImplementsArray");
		//((MatrixImplementsArray)helpermatrix.multiplyMatrix(matrix1,matrix2)).printMatrixV();
			
		
		System.out.println("TRANSPORT MATRIX1 FOR MatrixImplementsArray");
		((MatrixImplementsArray)helpermatrix.transport(matrix1)).printMatrixV();
	       

		
		//test for MatrixImplementsDoubleArray
		MatrixImplementsDoubleArray matrixA=new MatrixImplementsDoubleArray(6,3);  //input size first  matrix
		MatrixImplementsDoubleArray matrixB=new MatrixImplementsDoubleArray(5,4);  //input size second  matrix
		
		
		MatrixHelper helpmatrix1=new MatrixHelper(new MatrixImplementsDoubleArray());
        
		System.out.println("MATRIXA FOR MatrixImplementsDoubleArray");
		matrixA.printMatrix();
		System.out.println("MATRIXB FOR MatrixImplementsDoubleArray");
		matrixB.printMatrix();
        	
		
		
		System.out.println("SUM FOR MatrixImplementsDoubleArray");
		((MatrixImplementsDoubleArray)helpmatrix1.sumMatrix(matrixA,matrixB)).printMatrix();

		
		System.out.println("MULTIPLY FOR MatrixImplementsDoubleArray");
		((MatrixImplementsDoubleArray)helpmatrix1.multiplyMatrix(matrixA,matrixB)).printMatrix();
			
	
		
}//main 































};//class