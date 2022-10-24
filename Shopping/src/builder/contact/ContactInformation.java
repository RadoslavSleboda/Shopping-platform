package builder.contact;

public class ContactInformation {
	
	private final Name name;
	private final Adress adress;
	
	public Name getName() {
		return name;
	}

	public Adress getAdress() {
		return adress;
	}

	public ContactInformation(Builder builder) {
		this.name = builder.name;
		this.adress = builder.adress;
	}
	
	public static class Builder {
		
		private Name name;
		private Adress adress;
		
		public Builder name(Name name) {
			this.name = name;
			return this;
		}
		
		public Builder adress(Adress adress) {
			this.adress = adress;
			return this;
		}
		
		public ContactInformation build() {
			return new ContactInformation(this);
		}
	}

}
