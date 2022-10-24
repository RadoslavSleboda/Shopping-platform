package builder.contact;

public class Name {

	private final String title;
	private final String firstName;
	private final String surrname;
	
	public Name(Builder builder) {
		this.title = builder.title;
		this.firstName = builder.firstName;
		this.surrname = builder.surrname;
	}
	
	public String getTitle() {
		return title;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSurrname() {
		return surrname;
	}

	public static class Builder {
		
		private String title;
		private String firstName;
		private String surrname;
		
		public Builder title(String title) {
			this.title = title;
			return this;
		}
		
		public Builder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public Builder surrname(String surrname) {
			this.surrname = surrname;
			return this;
		}
		
		public Name build() {
			return new Name(this);
		}
	}
	
}
