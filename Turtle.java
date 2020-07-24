public class Turtle{

	// instance variables

	// (x,y) coordinate on the plane
	double x;
	double y;

	// direction the turtle is facing, walking direction
	double angle;

	// static variable is visible and can be changed by any object
	// there only one numberOfTurtles
	// THIS IS NOT an instance variable
	static int numberOfTurtles = 0;


	// Constructor initializes the object instance variables
	// Has the same name of the class and does not return a value
	public Turtle (double x0, double y0, double a0){ // 3 arguments
		x = x0;
		y = y0;
		angle = a0;
		numberOfTurtles += 1;
	}
	// no argument constructor
	public Turtle (){ // 0 arguments
		x = 0.0;
		y = 0.0;
		angle = 45.0;
		numberOfTurtles += 1;
	}

	// Method to change the turtle's direction
	public void turnLeft (double delta){
		angle += delta;
	}

	// Method to move the turtle forward.
	// Not static method because it is individualized 
	// for each of the objects that it applies to and 
	// is not general.
	public void moveForward (double d) { // non-static method = object

		double oldx = x;
		double oldy = y;
		x += d * Math.cos(Math.toRadians(angle));
		y += d * Math.sin(Math.toRadians(angle));
		StdDraw.line(oldx, oldy, x, y);
	}

	public static void main(String[] args){

		// instantiate a turtle
		Turtle t1 = new Turtle(0.5, 0.5, 10.0);
		t1.moveForward(1.0);
		t1.turnLeft(45.0);
		t1.moveForward(1.0);

		Turtle t2 = new Turtle();
		t2.moveForward(1.0);
		t2.turnLeft(45.0);
		t2.moveForward(1.0);

		System.out.println("Number of turtle objects is " + numberOfTurtles);

	}
}