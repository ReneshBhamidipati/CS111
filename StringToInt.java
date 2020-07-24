public class StringToInt{
	public static int stringConvertToInt(String str){
		int sum = 0;
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			int value = c - '0'; // the -'0' part converts character into int
			int position = str.length() - i;
			int position_value = (int)Math.pow(10,(position-1));
			sum += value*position_value; 
		}
		return sum;
	}
	public static void main(String[] args){
		StdOut.println(stringConvertToInt(args[0]));
	}
}