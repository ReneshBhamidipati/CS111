public class EquilateralTriangle{
	public static void main(String[] args){
		double x = 0;
		double y = 0;
		double x1 = 1;
		double y1 = 0;
		double x2 = 0.5;
		double y2 = Math.sqrt(3.0)/2.0;

		StdDraw.line(x,y,x1,y1);
		StdDraw.line(x1,y1,x2,y2);
		StdDraw.line(x2,y2,x,y);
		// class.method is the usual order
	}
}