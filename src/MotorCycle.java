
public class MotorCycle extends Vehicle implements VehicleInterface{
	
	private Boolean hasSideCar;
	public Boolean getHasSideCar() {
		return hasSideCar;
	}



	public void setHasSideCar(Boolean hasSideCar) {
		this.hasSideCar = hasSideCar;
	}



	public MotorCycle(boolean b){
	}
	

	
	public void transferOwnership(Person newOwner) {
		this.setOwner(newOwner);
	}

	
	

	

}