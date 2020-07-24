public class RecursiveAppend{
	public static String appendNTimes(String original, int n){
		if (n==0) return original;
		return original + appendNTimes (original, n-1);
	}
	public static void main(String[] args){
		String result = appendNTimes("cat",2);
		StdOut.println(result);
	}
}