package p04.map.hashmap;

public class Name {
	String firstName;
	String lastName;
	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public int hashCode() {
		return (firstName+lastName).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Name) {
			Name n = (Name) obj;
			return this.firstName.equals(n.firstName) &&
					this.lastName.equals(n.lastName);
		}
		return false;
	}
	
}
