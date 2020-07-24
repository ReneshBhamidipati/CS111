public class LuckySevens{
	public static void main(String[] args){
		int count = 0;
		for (int i = 0; i < args[0].length(); i++){
			if (args[0].charAt(i) == '7'){
				count += 1;
			}
		}
		System.out.println("Number of Sevens: " + count);
	}
}