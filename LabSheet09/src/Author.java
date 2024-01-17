
public class Author {
	private String name;
	private String email;
	private char gender;
	
	Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	Author(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	Author(){
		this.name = "";
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getGenderName() {
		if(this.gender == 'M' || this.gender == 'm') {
			return "Male";
		}
		else if (this.gender == 'F' || this.gender == 'f') {
			return "Female";
		}
		else {
			return null;
		}
	}
	
	public String toString() {
		return "Author name: " + name + " (" + email + ";" + getGenderName() + ")";
	}
}
