
public class Truck extends Vehicle implements VehicleInterface{
	private Integer numberOfAxels;
	
	public Integer getNumberOfAxels() {
		return numberOfAxels;
	}

	public void setNumberOfAxels(Integer numberOfAxels) {
		this.numberOfAxels = numberOfAxels;
	}

	public void set_axels(Integer num_Of_axels){
		this.numberOfAxels= num_Of_axels;
	}
	
	public void transferOwnership(Person newOwner) {
		this.setOwner(newOwner);
	}
}