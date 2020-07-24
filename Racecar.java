public class Racecar{
	private int capacity = 0; // these are all instance variables
	private int fuel = 0;
	private int speed = 0;

	public Racecar(int capacity){ // constructor
		//this.capacity = capacity; // purpose is to initialize all instance variables
		//fuel = capacity;
		//speed = 0;
		this(capacity, capacity, 0);
	}

	public Racecar(int capacity, int fuel, int speed){ // constructor
		this.capacity = capacity; // purpose is to initialize all instance variables
		this.fuel = fuel;
		this.speed = speed;
	}

	public int getCurrentSpeed(){ // methods, NOT static
		return speed;				// get methods return a instance variable, and is for int
	}
	public boolean accelerate(){
		if (fuel == 0) return false;
		else{
			fuel -= 1;
			speed += 10;
			return true;
		}
	}
	public boolean isOutOfFuel(){ // is methods return boolean (t/f)
		if (fuel == 0) return true; // use conditions
		else return false;
	}
	public double refuel(double costPerGallon){
		fuel = capacity; // this is to show that when you refill the gas, the fuel becomes the capacity
		// think of real life; they fill the fuel tank up all the way up to capcacity,
		// and then you pay the total bill
		double total_bill = (costPerGallon*(capacity - fuel));
		return total_bill;
	}
	public static void main(String[] args) { // main is the test client
		Racecar r = new Racecar(2);
		StdOut.println(r.isOutOfFuel());
		StdOut.println(r.accelerate());
		StdOut.println(r.refuel(3.10));
		StdOut.println(r.getCurrentSpeed());
		StdOut.println(r.accelerate());
		StdOut.println(r.getCurrentSpeed());
		StdOut.println(r.accelerate());
		StdOut.println(r.getCurrentSpeed());
		StdOut.println(r.accelerate());
		StdOut.println(r.getCurrentSpeed());
		StdOut.println(r.isOutOfFuel());
		StdOut.println(r.refuel(3.20));

	}
}