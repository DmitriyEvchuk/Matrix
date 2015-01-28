

	interface Matrix {


	  	void setMatrixVal(int row,int col,int val);

		Integer getMatrixVal(int row,int col);

		Integer getRowsLength();

		Integer getColsLength();

		Integer compareRowsMatrix(Matrix matrix);

		Integer compareColsMatrix(Matrix matrix);

		void createMatrix(int sizeRow,int sizeCol);

		

		
}
