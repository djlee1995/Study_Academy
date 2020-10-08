class Name {
	String firstName; // ¿Ã∏ß
	String lastName; // º∫

	Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int hashCode() {
		return firstName.hashCode() + lastName.hashCode();
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Name))
			return false;
		Name name = (Name) obj;
		if (firstName.equals(name.firstName) && lastName.equals(name.lastName))
			return true;
		else
			return false;

	}
}