package detail;

public class XCartDetail {

	private String email;

	private String pass;

	private String search;

	private String firstName;

	private String lastName;

	private String address;

	private String city;

	private String country;

	private String state;

	private String phone;

	public XCartDetail(String email, String pass, String search, String firstName, String lastName, String address,
			String city, String country, String state, String phone) {
		this.email = email;
		this.pass = pass;
		this.search = search;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.country = country;
		this.state = state;
		this.phone = phone;

	}

	public String getEmail() {
		return email;
	}

	public String getPass() {
		return pass;
	}

	public String getSearch() {
		return search;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getPhone() {
		return phone;
	}

	public String getLastName() {
		return lastName;
	}

	public String getCountry() {
		return country;
	}

	public String getState() {
		return state;
	}

}
