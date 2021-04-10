package org.question_1b;

public class Address_1b {
	private String street,city,state,country,zip;
		
	public Address_1b(String street, String city, String state, String country, String zip) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip = zip;
	}

	public String getStreet() {
		return street;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getZip() {
		return zip;
	}

	@Override
	public String toString() {
		return street+""+city+""+state+""+country+zip;
	}	

}
