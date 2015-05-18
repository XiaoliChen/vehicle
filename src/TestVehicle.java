
public class TestVehicle {
	
	public static void main(String[] args){
		Person a = new Person();
		a.setFirstName("Tom");
		Car camry = new Car();
		camry.setOwner(a);
		camry.set_numDoors(4);
		
		Truck frontier = new Truck();
		frontier.setOwner(a);
		frontier.set_axels(2);
		
		Person b = new Person();
		b.setFirstName("Jarry");
		b.setLastName("Cyrus");
		frontier.transferOwnership(b);
		System.out.println(frontier.getOwner());
		
		MotorCycle harley = new MotorCycle(false);
		harley.setHasSideCar(false);
	}	
	}
