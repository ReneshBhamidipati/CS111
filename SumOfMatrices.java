public class SumOfMatrices{
	public static void main(String[] args){
		// matrix 1
		int [][] mat1 = new int [3][3];
		// initialize mat1
		mat1[0][0] = 1;
		mat1[0][1] = 2;
		mat1[0][2] = 3;
		mat1[1][0] = 4;
		mat1[1][1] = 5;
		mat1[1][2] = 6;
		mat1[2][0] = 7;
		mat1[2][1] = 8;
		mat1[2][2] = 9;
		
		// matrix 2
		int [][] mat2 = new int [3][3];
		// initialize mat2
		mat2[0][0] = 9;
		mat2[0][1] = 8;
		mat2[0][2] = 7;
		mat2[1][0] = 6;
		mat2[1][1] = 5;
		mat2[1][2] = 4;
		mat2[2][0] = 3;
		mat2[2][1] = 2;
		mat2[2][2] = 1;

		// output matrix (sum of mat1 and mat2)
		int [][] outmat = new int [3][3];
		for (int row = 0; row < 3; row++){
			for (int col = 0; col < 3; col++){
				outmat[row][col] = Math.abs(mat1[row][col] - mat2[row][col]); // you are performing operations here
			}
		}
		// print the output matrix
		for (int row = 0; row < 3; row++){
			for (int col = 0; col < 3; col++){
				System.out.print(outmat[row][col] + " "); // you are printing here
			}
			System.out.println(); // after the innermost for loop, it will go to this area of code and then row++ last
			// if there is nothing in this area, it will just hit the two } braces and then go to row ++
		}


	}
}