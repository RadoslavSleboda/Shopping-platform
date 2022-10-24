package builder.contact;

public class CardInformation {
	
	private final String cardNumber;
	private final String securityNumber;
	private final String expirationMonth;
	private final String expirationDay;
	
	
	
	public CardInformation(Builder builder) {
		this.cardNumber = builder.cardNumber;
		this.securityNumber = builder.securityNumber;
		this.expirationMonth = builder.expirationMonth;
		this.expirationDay = builder.expirationDay;
	}



	

	public String getCardNumber() {
		return cardNumber;
	}





	public String getSecurityNumber() {
		return securityNumber;
	}





	public String getExpirationMonth() {
		return expirationMonth;
	}





	public String getExpirationDay() {
		return expirationDay;
	}





	public static class Builder {
		
		private String cardNumber;
		private String securityNumber;
		private String expirationMonth;
		private String expirationDay;
		
		public Builder cardNumber(final String cardNumber) {
			this.cardNumber = cardNumber;
			return this;
		}
		
		public Builder securityNumber(final String securityNumber) {
			this.securityNumber = securityNumber;
			return this;
		}
		
		public Builder expirationMonth(final String expirationMonth) {
			this.expirationMonth = expirationMonth;
			return this;
		}
		
		public Builder expirationDay(final String expirationDay) {
			this.expirationDay = expirationDay;
			return this;
		}
		
		public CardInformation build() {
			return new CardInformation(this);
		}
	}

}
