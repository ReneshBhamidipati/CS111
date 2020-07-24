public class ReverseString{
	public static String revStrIter(String str){
		String result = "";
		for(int i = str.length()-1; i>=0; i--){
			result += str.charAt(i);
		}
		return result;
	}
	public static String revStrRecursive(String str){
		if(str.length()==0) return str; // base case
		if(str.length()==1) return str; // this works as a base case but is not required
		return str.substring(str.length()-1)+revStrRecursive(str.substring(0,str.length()-1)); // recursive case
	}

	public static void main(String[] args){
		//String str = "Renesh";
		String str = "";
		// String result = "";
		// for(int i = str.length()-1; i>=0; i--){
		// 	result += str.charAt(i);
		// }
		StdOut.println(revStrRecursive(str));
	}
}