public class TriangleOfStars{
	public static void main(String[] args){
		
		int n = Integer.parseInt(args[0]);
		int row = 0;
		//int col = 0;
		while(row < n){
			
			int col = 0; // col is declared inside of the outer loop
			while (col <= row){ // while inside a while; double loop for matrix
				
				//System.out.println("row = "+row+", col = "+col");
				System.out.print("* ");
				col += 1; // column is in the inner loop b/c you need to print a row, but you can't print the stars without columns

			}
			System.out.println();
			row += 1;
		}
		// col is not visible outside of the outer loop
		// System.out.println("row = "+row+", col = "+col);
	}
}

// matrices use double loops; while inside while or for inside for