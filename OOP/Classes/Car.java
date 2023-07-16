public class Car {
	private String make;
	private String model;
	private int year;
	private double price;
	private DriverDemo driverDemo;

	public Car(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public Car(String make, String model, int year, double price, DriverDemo driverDemo) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.driverDemo = driverDemo;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public double getPrice() {
		return price;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public DriverDemo getDriverDemo() {
		return driverDemo;
	}

	public void setDriverDemo(DriverDemo driverDemo) {
		this.driverDemo = driverDemo;
	}

	public void displayInfo() {
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
		System.out.println("Price: $" + price);
		System.out.println("DriverDemo: ");
		if (driverDemo != null) {
			driverDemo.displayInfo();
		}
	}
}
