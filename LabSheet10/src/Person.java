
public class Person {
	//declare 2 private attributes
	private String firstName;
	private String lastName;
	
	//Default constructor
	//Initialize firstName and lastName to an empty string
	Person(){
		firstName = "";
		lastName = "";
	}
	
	//Constructor with parameter
	Person(String first, String last){
		//firstName = first;
		//lastName = last;
		setName(first, last);
	}
	
	//Method to set firstName and lastName according to parameters
	public void setName(String first, String last) {
		firstName = first;
		lastName = last;
	}
	
	//Method to return firstName
	public String getFirstName() {
		return firstName;
	}
	
	//Method to return lastName
	public String getLastName() {
		return lastName;
	}
	
	//Method to return firstName and lastName
	public String toString() {
		return firstName + " " + lastName;
	}
}
