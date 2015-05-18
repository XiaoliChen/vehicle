

public abstract class Vehicle {
	
	private String car_name;
	private String color;
	private Integer Weight;
	private Person Owner;
	abstract void transferOwnership(Person newOwner);	
		
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}

	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	

	public Integer getWeight() {
		return Weight;
	}
	public void setWeight(Integer weight) {
		Weight = weight;
	}

	
	
	public Person getOwner() {
		return Owner;
	}
	public void setOwner(Person owner) {
		Owner = owner;
	}

	
		
	}
