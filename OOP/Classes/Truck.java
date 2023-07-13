public class Truck extends Car {
	private String color;

	public Truck(String make, String model, int year, double price, String color) {
		super(make, model, year, price);
		this.color = color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println("Color: " + getColor());
	}

	public static void main(String[] args) {
		// Create an instance of Truck and test its functionality
		Truck truck1 = new Truck("Ford", "F-150", 2022, 45000.0, "Blue");
		truck1.displayInfo();
	}
}