
public class PersonalInfo {
	private Person name; //object name references class Person
	private Date bDay; //object bDay references class Date
	//declare 1 private attribute
	private int personID;
	
	//Default constructor
	//Postcondition: firstName = "", lastName = ""
	//dMonth = 1, dDay = , and dYear = 1990
	//personID = 0
	
	PersonalInfo(){
		name = new Person(); //firstName = "", lastName = ""
		bDay = new Date(); //dMonth = 1, dDay = , and dYear = 1990
		personID = 0;
	}
	
	//Constructor with parameter
	PersonalInfo(String first, String last, int month, int day, int year, int ID){
		name = new Person(first, last); //firstName = first, lastName = last
		bDay = new Date(month, day, year);
		personID = ID;
	}
	
	//Method to set the personal information
	//invoke(call) set method class Person and class date
	
	public void setPersonalInfo(String first, String last, int month, int day, int year, int ID) {
		name.setName(first, last);
		bDay.setDate(month, day, year);
		personID = ID;
	}
	
	//Method to return the string of personal information
	public String toString() {
		return "Name: " + name + "\n" + "Date of birth: " + bDay + "\n" + "Personal ID: " + personID;
	}
}
