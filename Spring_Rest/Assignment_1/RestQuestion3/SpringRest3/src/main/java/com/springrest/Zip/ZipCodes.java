package com.springrest.Zip;

public class ZipCodes {
	    private String zipCodes;
	    private String state;
	    private String city;
	    private String country;
	    
		public ZipCodes(String zipCodes, String state, String city, String country) {
			super();
			this.zipCodes = zipCodes;
			this.state = state;
			this.city = city;
			this.country = country;
		}

		public String getZipCodes() {
			return zipCodes;
		}

		public void setZipCodes(String zipCodes) {
			this.zipCodes = zipCodes;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		@Override
		public String toString() {
			return "ZipCodes [zipCodes=" + zipCodes + ", state=" + state + ", city=" + city + ", country=" + country
					+ "]";
		}
	    
		
	    

}
