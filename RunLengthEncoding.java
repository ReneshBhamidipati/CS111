public class RunLengthEncoding{

	public static String appendNTimes(String original, int n){
		if (n==0) return original;
		return original + appendNTimes (original, n-1);
	}
	// Encodes the original string by finding sequences in the string 
	// where the same character repeats.
  	// Replace each such sequence by a token consisting of: the number 
  	// of characters in the sequence followed by the repeating character.
  	// Write an iterative encode method. 
  	// Returns the encoded string.
	public static String encode (String original){
		String result = "";
 
      char ch=0;
      int count=1;
      for (int x = 0; x < original.length(); x++) { 
         if (ch == original.charAt(x)){
            count = count + 1;
         } else {
            if(count != 1){
               result = result + count;
            }
            result = result + ch;
            ch = original.charAt(x);
            count = 1;
         }
      }
      if(count != 1){
         result = result + count;
      }
       result = result + ch;
       return result;
	}

	public static String fillChar(String s, int n){
		String result = "";
		for(int i = 0; i <(n-1); i++){
			result += s;
		}
		return result;
	}
	// Decodes the original string encoded with the encode method. 
  	// Returns the decoded string.
  	// YOUR decode METHOD MUST BE RECURSIVE.
  	// Do not use while, do/while, or for loops.
	public static String decode (String original){
		int length = original.length();
 
        //base case
        if(length <= 1){                         
            return original;
        }
 
        if(Character.isLetter(original.charAt(0))){
            String beg = original.substring(0,1);
            String end = original.substring(1);
            return beg + decode(end);
        }
 
        else{
            String charone = original.substring(0,1);    
            int x = Integer.parseInt(charone);                             
            String chartwo = original.substring(1,2);    
            String end = original.substring(1);
            //char[] chars = new char[x-1];
           // Arrays.fill(chars, chartwo);
            //String text = new String(chars);  
            return fillChar(chartwo,x) + decode(end);           
        }
 
    }
	// Tests each of the API methods by directly calling them.
	public static void main(String[] args){
		String result = decode("q2a3bc4d");
		//String result = fillChar('a',4);
		StdOut.println(result);
	}
}