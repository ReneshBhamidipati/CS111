public class EvenOddString{
	public static String reverseString(String str){
		if(str.length() == 0) return str;
		return str.substring(str.length()-1) + reverseString(str.substring(0,str.length()-1));
	}
	public static String bizarre(String str){
		String[] arr = str.split(" ");
		String result = "";
		for(int i = 0; i < arr.length; i++){
			if(arr[i].length() %2 == 0) result += reverseString(arr[i]);
			else
				result += arr[i];
			result += " ";
		}
		return result;
	}
	public static void main(String[] args) {
		StdOut.println(bizarre(" "));
	}
}