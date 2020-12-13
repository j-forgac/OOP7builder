public class User {
	private String name;
	private String surname;
	private int age;
	private boolean gender; //* true for male, false for female
	private int phone;
	private String username;
	private String password;

	private User(Builder a){
		name = a.name;
		surname = a.surname;
		age = a.age;
		gender = a.gender;
		phone = a.phone;
		username = a.username;
		password = a.password;
	}

	public static class Builder{
		private String name;
		private String surname;
		private int age;
		private boolean gender;
		private int phone;
		private String username;
		private String password;

		public Builder(String username, String password){
			this.username = username;
			this.password = password;
		}

		public Builder name(String name){
			this.name = name;
			return this;
		}

		public Builder surname(String surname){
			this.surname = surname;
			return this;
		}
		public Builder age(int age){
			this.age = age;
			return this;
		}
		public Builder gender(boolean gender){
			this.gender = gender;
			return this;
		}
		public Builder phone(int phone){
			this.phone = phone;
			return this;
		}
	}


}
