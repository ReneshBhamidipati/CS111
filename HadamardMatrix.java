public class HadamardMatrix{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		boolean[][]hadamard = new boolean[n][n];
		
		hadamard[0][0] = true;
		for (int a = 1; a <n; a+=a){
			for (int row = 0; row < a; row ++){
				for (int column = 0; column < a; column ++){
					hadamard[row+a][column] = hadamard[row][column];
					hadamard[row][column+a] = hadamard[row][column];
					hadamard[row+a][column+a] = !hadamard[row][column];
				}
			}
		}
		for (int row = 0; row < n; row++){
			for (int column = 0; column < n; column++){
				if (hadamard[row][column]){
					System.out.print("T ");
				}
				else{
					System.out.print("F ");
				}
			}
				System.out.println();
		}
	}
}