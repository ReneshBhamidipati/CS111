public class WCS111FM{
	public static void main(String[] args){
		int hours_spent_programming = Integer.parseInt(args[0]);
		
		if (hours_spent_programming == 0){
			System.out.println("Nothing");	
		}
		else if (hours_spent_programming >= 1 && hours_spent_programming<=5){
			System.out.println("T-shirt");
		}
		else if (hours_spent_programming >=6 && hours_spent_programming <= 400){
			if (hours_spent_programming % 10 == 9){
				if (hours_spent_programming % 3 == 0){
					System.out.println("Laptop");
					System.out.println("TV");	
				}
				else{
					System.out.println("Laptop");	
				}
			}
			else if (hours_spent_programming % 2 == 0 && hours_spent_programming % 3 == 0){
					System.out.println("Hat");
					System.out.println("TV");	
			}
			else if (hours_spent_programming % 2 == 0){ 
				System.out.println("Hat");
			}
		}
		else if (hours_spent_programming > 400){
			System.out.println("Cat");	
		}
	}
}
