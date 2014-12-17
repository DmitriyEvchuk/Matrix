class SumMatrix
		{

protected Integer [][]rezMatrix;

private Integer [][]buffMatrix1;
private Integer [][]buffMatrix2;
private int rowsRezMatrix=0;
private int columnsRezMatrix=0;
		
 	
	public Matrix sum(Matrix matrix1,Matrix  matrix2 ){
		
		//init and fill buffMatrix1,buffMatrix2. rezMatrix only init 
		fillBuffMtr(matrix1,matrix2); 
		
		Matrix rezMatrix=new Matrix(rowsRezMatrix,columnsRezMatrix);
			
		for(int i = 0; i<rezMatrix.getRowsMatrixLength(); i++){
	
		  for(int j = 0; j<rezMatrix.getRowsMatrixLength(); j++){			
	    	
		  rezMatrix.setMatrix()[i][j]=buffMatrix1[i][j]+buffMatrix2[i][j]; 
		
		  }//for j
		
		}//for i
               	
		return rezMatrix;	
		
		}//sum


	private void fillBuffMtr(Matrix matrix1,Matrix matrix2){
		
		
		// get size for rezMatrix,buffMatrix1,buffMatrix2
		if(matrix1.getRowsMatrixLength()>=matrix2.getRowsMatrixLength()){
		  rowsRezMatrix=matrix1.getRowsMatrixLength();} 
		else
		  {rowsRezMatrix=matrix2.getRowsMatrixLength();}

		if(matrix1.getColumnsMatrixLength()>=matrix2.getColumnsMatrixLength()){
		  columnsRezMatrix=matrix1.getColumnsMatrixLength();}    
		else
		  {columnsRezMatrix=matrix2.getColumnsMatrixLength();}
		
		

		buffMatrix1=new Integer[rowsRezMatrix][columnsRezMatrix];
		buffMatrix2=new Integer[rowsRezMatrix][columnsRezMatrix];
	
		//fill buffMatrix1 
		for (int i=0;i<rowsRezMatrix ;i++ )
		{
		  for (int j=0;j<columnsRezMatrix;j++)
		{
		    if ((matrix1.getRowsMatrixLength()>i)&&(matrix1.getColumnsMatrixLength()>j))
			buffMatrix1[i][j]=matrix1.getMatrix(i,j);
		    else
			buffMatrix1[i][j]=0; 
		
		}//for j  
		

		}//for i
	  
		//fill buffMatrix2 
		for (int i=0;i<rowsRezMatrix ;i++ )
		{
		  for (int j=0;j<columnsRezMatrix;j++)
		{
		   if ((matrix2.getRowsMatrixLength()>i)&&(matrix2.getColumnsMatrixLength()>j))
			buffMatrix2[i][j]=matrix2.getMatrix(i,j);
		   else
			buffMatrix2[i][j]=0;

		 
		}//for j  
		
		}//for i
	  
		
		
		}//initmatr

































}//class