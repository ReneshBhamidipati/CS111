public class OnlyDigits{
	public static boolean digitsOnlyIter(String str){
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if(!(c>='0' && c<='9')) return false;
		}
		return true;
	}
	public static boolean digitsOnlyRecursive(String str){
		if(str.length() == 0) return true; // base
		if(!(str.charAt(0)>='0' && str.charAt(0)<='9')) return false;
		//return digitsOnlyRecursive(str.substring(1,str.length());
		return digitsOnlyRecursive(str.substring(1));
	}
	public static void main(String[] args){
		StdOut.println(digitsOnlyRecursive(args[0]));
	}
}