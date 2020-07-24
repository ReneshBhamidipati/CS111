public class RandomWalker{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]); // n = number of steps
		int x = 0;
		int y = 0;
		int max = 4;
		int min = 1;
		int range = (max-min)+1;
		System.out.println("("+x+","+y+")");
		for(int i = 0; i < n; i++){
			int randomNumber = (int)(Math.random()*range)+min; 
			// recalculate the new coordinates
			if (randomNumber == 1){
				x++; // East
			}
			else if (randomNumber == 2){
				y++; // North
			}
			else if (randomNumber == 3){
				x--; // West
			}
			else if (randomNumber == 4){
				y--; // South
			}
			System.out.println("("+x+","+y+")");
		}
		double distance = ((x*x)+(y*y));
		System.out.println("Squared Distance: "+distance);
	}
}
