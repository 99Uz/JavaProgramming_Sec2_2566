import java.time.*;
public class FictionBook implements Author, Book{
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	public FictionBook(String title, int publicYear) {
		this.title = title;
		this.publicYear = publicYear;
	}
	
	public void setAuthorName(String name) {
		this.author_name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean checkFormatName() {
		return this.author_name.indexOf(" ") > 0;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getLastName() {
		return this.author_name.substring(this.author_name.indexOf(" ")).trim().toUpperCase();
	}
	
	public String getFirstName() {
		return this.author_name.substring(0,this.author_name.indexOf(" ")).trim().toUpperCase();
	}
	
	public boolean checkEmail() {
		if(this.email.endsWith("@hotmail.com") || this.email.endsWith("@windowslive.com")) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public int totalPublicYear() {
		return Year.now().getValue() - publicYear;
	}
	
	public String toString() {
		return title + " write by " + getLastName().charAt(0) + "." + getFirstName() + " (" + email + ")"
			   + "\nPublished for " + totalPublicYear() + " years.";
	}

}
