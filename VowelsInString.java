public class VowelsInString{
	public static int vowelsIter(String str){
		String vow = "aeiou";
		int count = 0;
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if(vow.contains(""+c)) count++;
		}
		return count;
	}
	public static int vowelsRecursive(String str){
		if(str.length() == 0) return 0;
		if("aeiou".contains(str.substring(0,1)))
			return 1 + vowelsRecursive(str.substring(1));
		else 
			return vowelsRecursive(str.substring(1));
	}
	public static void main(String[] args){
		String str = args[0];
		StdOut.println(vowelsRecursive(str));
	}
}