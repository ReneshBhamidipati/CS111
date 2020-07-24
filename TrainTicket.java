public class TrainTicket{
	public static void main(String[] args){
		int person_age = Integer.parseInt(args[0]);
		boolean area_of_purchase = Boolean.parseBoolean(args[1]);
		System.out.println("Area of purchase: " + area_of_purchase);
		
		double price = 0.0;
		if (person_age<0 || person_age>120){
			System.out.println("Illegal input");
		}
		else{
			if(person_age<7){
				price = 0.0;
			}
			else if (area_of_purchase == true){ // true for a ticket bought at the train station
					if(person_age>65){
						price = 7.50;
					}
					else{
						price = 13.20;
				}
			}
			else if(area_of_purchase == false){ // false for a ticket bought inside the train
					if(person_age>65){
						price = 7.50*1.2;
					}
					else{
						price = 13.20*1.2;
					}
				}
			}
			System.out.println("Price: " + price);
		}

	}
// when evaluating a condition, use ==
// when assigning a value to something, use =