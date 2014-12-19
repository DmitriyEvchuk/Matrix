
class SumMatrix
		{



private Integer [][]buffMatrix1;
private Integer [][]buffMatrix2;
private int rowsRezMatrix=0;
private int columnsRezMatrix=0;
		
 	
	public Matrix sum(Matrix matrix1,Matrix  matrix2 ){
		
		//init and fill buffMatrix1,buffMatrix2. rezMatrix only init 
		initBuffMatr(matrix1,matrix2); 
		fillBuffMtr(matrix1,buffMatrix1);
		fillBuffMtr(matrix2,buffMatrix2);

		Matrix rezMatrix=new Matrix(rowsRezMatrix,columnsRezMatrix);
			
		for(int i = 0; i<rezMatrix.getMatrix().length; i++){
	
		  for(int j = 0; j<rezMatrix.getMatrix()[0].length; j++){			
	    	
		  rezMatrix.setMatrixVal(i,j,buffMatrix1[i][j]+buffMatrix2[i][j]); //fill razMatrix
		
		  }//for j
		
		}//for i
               	
		return rezMatrix;	
		
		}//sum


	private void initBuffMatr(Matrix matrix1,Matrix matrix2){
		
		
		// get size for rezMatrix,buffMatrix1,buffMatrix2
		if(matrix1.getMatrix().length>=matrix2.getMatrix().length){
		  rowsRezMatrix=matrix1.getMatrix().length;} 
		else
		  {rowsRezMatrix=matrix2.getMatrix().length;}

		if(matrix1.getMatrix()[0].length>=matrix2.getMatrix()[0].length){
		  columnsRezMatrix=matrix1.getMatrix()[0].length;}    
		else
		  {columnsRezMatrix=matrix2.getMatrix()[0].length;}
		
		

		buffMatrix1=new Integer[rowsRezMatrix][columnsRezMatrix];
		buffMatrix2=new Integer[rowsRezMatrix][columnsRezMatrix];
	
		
	  
		
		
		}//initmatr


	private  void fillBuffMtr(Matrix matrix,Integer[][] buffMatrix){

	//fill buffMatrix 
		for (int i=0;i<rowsRezMatrix ;i++ )
		{
		  for (int j=0;j<columnsRezMatrix;j++)
		{
		    if ((matrix.getMatrix().length>i)&&(matrix.getMatrix()[0].length>j))
			buffMatrix[i][j]=matrix.getMatrix()[i][j];
		    else
			buffMatrix[i][j]=0; 
		
		}//for j  
		

		}//for i
	  	
		
		}//fillBuffMtr






























}//class
