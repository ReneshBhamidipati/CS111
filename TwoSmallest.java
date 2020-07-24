public class TwoSmallest{
	public static void main(String[] args){
		double smallest_no = Double.parseDouble(args[0]);
		int smallest_no_index = 0;
		for (int i = 1; i < args.length; i++){
			double current_no = Double.parseDouble(args[i]);
			if (smallest_no > current_no){
				smallest_no = current_no;
				smallest_no_index = i;
			}
		}
		double second_smallest_no = Double.parseDouble(args[0]);
		for (int i = 1; i < args.length; i++){
			double current_no = Double.parseDouble(args[i]);
			if (i == smallest_no_index){
				continue;
			}
			else{
				if (second_smallest_no > current_no){
					second_smallest_no = current_no;
				}
			}
		}
		System.out.println("Smallest Number: " + smallest_no);
		System.out.println("Second Smallest Number: " + second_smallest_no);
	}
}