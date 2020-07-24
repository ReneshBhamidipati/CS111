public class SquareOfStars{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		int row = 0;
		while (row<n){
			int col = 0;
			while (col<n){
				System.out.print("* ");
				col += 1;
			}
			System.out.println();
			row += 1;
		}
	}
}