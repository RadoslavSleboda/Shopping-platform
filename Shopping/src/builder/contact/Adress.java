package builder.contact;
public class Adress {

	private final String houseNumber;
	private final String city;
	private final String street;
	
	public Adress(Builder builder) {
		this.city = builder.city;
		this.houseNumber = builder.houseNumber;
		this.street = builder.street;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public String getCity() {
		return city;
	}
	
	public String getStreet() {
		return street;
	}
	
	public static class Builder {
		
		private String houseNumber;
		private String city;
		private String street;
		
		public Builder houseNumber(final String houseNumber) {
			this.houseNumber = houseNumber;
			return this;
		}
		
		public Builder city(final String city) {
			this.city = city;	
			return this;
		}
		
		public Builder street(final String street) {
			this.street = street;	
			return this;
		}

		public Adress build() {
			return new Adress(this);
		}
	}
}

