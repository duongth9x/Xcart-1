package builder;

import detail.XCartDetail;

public class XCartDetailBuilder {
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

	public XCartDetailBuilder withEmail(String email) {
		this.email = email;
		return this;
	}

	public XCartDetailBuilder withPass(String pass) {
		this.pass = pass;
		return this;
	}

	public XCartDetailBuilder withSearch(String search) {
		this.search = search;
		return this;
	}

	public XCartDetailBuilder withFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public XCartDetailBuilder withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public XCartDetailBuilder withAddress(String address) {
		this.address = address;
		return this;
	}

	public XCartDetailBuilder withCity(String city) {
		this.city = city;
		return this;
	}

	public XCartDetailBuilder withCountry(String country) {
		this.country = country;
		return this;
	}

	public XCartDetailBuilder withState(String state) {
		this.state = state;
		return this;
	}

	public XCartDetailBuilder withPhone(String phone) {
		this.phone = phone;
		return this;
	}

	public XCartDetail build() {
		return new XCartDetail(email, pass, search, firstName, lastName, address, city, country, state, phone);
	}

}
