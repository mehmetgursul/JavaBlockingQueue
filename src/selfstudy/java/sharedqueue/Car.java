package selfstudy.java.sharedqueue;

public class Car {
	private String id;
	private String brand;
	private String model;
	private String year;

	public Car() {

	}

	public Car(String id, String brand, String model, String year) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", model=" + model + ", year=" + year + "]";
	}	
	
}
