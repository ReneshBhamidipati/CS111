public class Ordered{
	public static void main(String[] args){
		int w = Integer.parseInt(args[0]);
		int x = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		int z = Integer.parseInt(args[3]);
		boolean result = false;
		result = ((w<x)&&(x<y)&&(y<z)) || ((z<y)&&(y<x)&&(x<w));
		System.out.println(result);
	}

}