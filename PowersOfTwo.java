public class PowersOfTwo {
	public static void main (String[] args){
		int n = Integer.parseInt(args[0]);
		//int value = 1;
		
		//int i = 0; // exponent
		//while (i <= n){
			//System.out.println("2^"+i+"= "+value);
			//value *= 2;
			//i += 1;
		//}

		// transform the while loop into a for loop
		for (int i = 0; i <= n; i++ ){ // i++ is the same thing as i+=1; i-- = i-=1
			System.out.println("2^"+i+"= "+Math.pow(2,i));
			//value *= 2;
		}
	}
}

// FOR LOOP: for (initializaiton; boolean expression/continuation; increment)
// initialization; executed one time before loop starts
// boolean expression; loop body is executed if condition is true
// increment; executed after all body statements have been executed