public class DollarsToWords{
	public static void dolToword(int dollars){
		String [] map = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String [] tens_map = {"zero", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		String input = ""+dollars; // convert int to String w/ ""+ (int variable)
		for(int i = 0; i < input.length(); i++){
			char c = input.charAt(i);
			int convertedChar = Integer.parseInt(""+c);
			int position = input.length() - i;
			if (position == 3)
				StdOut.print(" "+map[convertedChar] + " hundred");
			else if (position == 2)
				StdOut.print(" "+tens_map[convertedChar]);
			else if (position == 1)
				if (convertedChar != 0)
					StdOut.print(" "+map[convertedChar]);
				else 
					StdOut.print("");
		}
		StdOut.println(" dollars");
	}
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]); // convert string to integer w/ Integer.parseInt
		dolToword(n);
		//StdOut.println(dolToword(n));
	}
}