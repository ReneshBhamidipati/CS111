public class PolygonTransform{
	public static double[] copy(double[] array){
		double[] b = new double[array.length];
		for(int i = 0; i < array.length; i++){
			b[i] = array[i];
		}
		return b;
	}
	public static void scale(double[] x, double[] y, double alpha){ //void = no return statement
		for(int i = 0; i < x.length; i++){
			x[i] *= alpha;
			y[i] *= alpha;
		}
	}
	public static void translate(double[] x, double[] y, double dx, double dy){
		for(int i = 0; i < x.length; i++){
			x[i] += dx;
			y[i] += dy;
		}
	}
	public static void rotate(double[] x, double[] y, double theta){
		double [] a = copy(x);
		for(int i = 0; i < x.length; i++){
			x[i] = x[i]*Math.cos(Math.toRadians(theta)) - y[i]*Math.sin(Math.toRadians(theta));
			y[i] = y[i]*Math.cos(Math.toRadians(theta)) + a[i]*Math.sin(Math.toRadians(theta));
		}
	}
	public static void main(String[] args){
		double[] x = {0,1,1,0};
		double[] y = {0,0,2,1};
		double alpha = 2.0;
		double dx = 2.0;
		double dy = 1.0;
		double theta = 45.0;
		// test scale
		StdDraw.setScale(-5.0,5.0);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.polygon(x,y);
		double[] x_scale = copy(x);
		double[] y_scale = copy(y);
		scale(x_scale,y_scale,alpha);
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.polygon(x_scale,y_scale);
		// test translate
		StdDraw.setScale(-5.0,5.0);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.polygon(x,y);
		double[] x_translate = copy(x);
		double[] y_translate = copy(y);
		translate(x_translate,y_translate,dx,dy);
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.polygon(x_translate,y_translate);
		// test rotate
		StdDraw.setScale(-5.0,5.0);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.polygon(x,y);
		double[] x_rotate = copy(x);
		double[] y_rotate = copy(y);
		rotate(x_rotate,y_rotate,theta);
		//rotate(x_rotate,y_rotate,-theta);
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.polygon(x_rotate,y_rotate);


	}
}