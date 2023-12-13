import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String fullName, firstName, lastName;
		System.out.print("Full Name: ");
		fullName = scan.nextLine();
		int countSpace = fullName.indexOf(" ");
		if (countSpace == -1) {
			System.out.print("Incorrect Name");
		}
		else {
			firstName = fullName.substring(0, countSpace);
			lastName = fullName.substring(countSpace+1);
			System.out.print("First Name: " + firstName.toUpperCase());
			System.out.print("\nLast Name: " + lastName.toLowerCase());
		}
	}

}
