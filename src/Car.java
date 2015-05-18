public class Car extends Vehicle implements VehicleInterface {
	
	private Integer numberOfDoors;
	
	public Integer getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(Integer numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public Car(){
	}
	
	public void set_numDoors(Integer num_doors){
		this.numberOfDoors = num_doors;
	}

	@Override
	
	public void transferOwnership(Person newOwner) {
		this.setOwner(newOwner);
	}	
}