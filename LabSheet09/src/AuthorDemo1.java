import java.util.*;
public class AuthorDemo1 {

	public static void main(String[] args) {
		String name, email;
		char gender;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input author name   : ");
		name = scan.nextLine();
		System.out.print("Input author e-mail : ");
		email = scan.nextLine();
		System.out.print("Input author gender : ");
		gender = scan.next().charAt(0);
		System.out.println();	
		Author a1 = new Author(name, email, gender);
		System.out.print(a1);
	}

}
