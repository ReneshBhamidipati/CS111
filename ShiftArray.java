public class ShiftArray{
	public static void main(String[] args){
		int [] a = {7,9,10,20};
		int value = a[0];
		for (int i = 0; i < a.length-1; i++){
			a[i] = a[i+1];
		}
		a[a.length-1] = value;
		for (int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	} 
}