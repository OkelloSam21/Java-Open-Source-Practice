public class DriverDemo {
	private String name;
	private String phoneNumber;
	private String address;
	private String dateOfBirth;

	public DriverDemo(String name, String phoneNumber, String address, String dateOfBirth) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DriverDemo withName(String name) {
		this.name = name;
		return this;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public DriverDemo withPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public DriverDemo withAddress(String address) {
		this.address = address;
		return this;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public DriverDemo withDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		return this;
	}

	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("PhoneNumber: " + phoneNumber);
		System.out.println("Address: " + address);
		System.out.println("DateOfBirth: " + dateOfBirth);
	}
}
