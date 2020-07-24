public class Palindrome{
	public static boolean pal_iterative(String str){
		if(str.length() == 1) return true;
		for(int i = 0; i < str.length(); i++){
			if (str.charAt(i) != str.charAt(str.length()-1-i)){
				return false;
			}
		}
		return true;
	}
	public static boolean pal_recursive(String str){
		if(str.length()<=1) return true; // base case
		if(str.charAt(0) != str.charAt(str.length()-1)) return false; // base case
		return pal_recursive(str.substring(1,str.length()-1)); 
	}
	public static void main(String[] args){
		StdOut.println(pal_recursive("car"));

	}
}