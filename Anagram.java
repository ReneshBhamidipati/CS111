public class Anagram{
	public static boolean ana(String str1, String str2){
		for(int i = 0; i < str1.length(); i++){
			char letter = str1.charAt(i);
			int index = str2.indexof(letter);
			if(index == -1){
				return false;
			}
			else{
				String before = str2.substring()
			}
		}
		return true;
	}
}