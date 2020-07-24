public class GuessingGame{
	public static void main(Stirng[] args){
		Stdout.println("Enter an integer between 1 and 1000");
		int secretnumber = 1+(int)(Math.random()*1000);
		int guess = 0;

		while(guess != secretnumber){
			//prompt user for guess and provide an answer
			Stdout.print("What is your guess?");
			guess = Std.readint();
		}

	}
}