public class HaystackNeedle{
	public static boolean substringExists(String needle, String haystack){
		if(haystack.contains(needle)) return true;
		else return false;
	}
	public static void main(String[] args){
        StdOut.println(substringExists("llo W","Hello World"));
	}
}