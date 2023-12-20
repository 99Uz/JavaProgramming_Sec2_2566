import java.util.*;
public class Lab603 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Please enter your name, separated by space.\n:");
		String fullName = scan.nextLine();
		//abbreviatName(fullName);
		System.out.print(abbreviatName(fullName));
	}
	
	public static String abbreviatName(String fullname) {
		String name = "";
		for(int i = 0; i < fullname.length(); i++) {
			if(fullname.charAt(i) == ' ') {
				name = name + fullname.charAt(i+1);
			}
		}
		return name;
	}
}
