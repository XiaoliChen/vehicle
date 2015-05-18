import static org.junit.Assert.*;

import org.junit.Test;


public class VehicleJunit {

	@Test
	public void testSideCar() {
		MotorCycle noSideCar = new MotorCycle(false);
		assertFalse("No side car on motorcycle", noSideCar.getHasSideCar());
	}
	
	@Test
	public void testOwnership(){
		Person a = new Person();
		Truck truck = new Truck();	
		truck.setOwner(a);
		Person b = new Person();
		truck.transferOwnership(b);
		
		assertTrue("Transfer ownership to Person b", truck.getOwner());
	}

	private void assertTrue(String string, Person owner) {
		// TODO Auto-generated method stub
		
	}
	
}