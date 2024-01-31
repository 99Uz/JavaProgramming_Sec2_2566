import java.util.*;
public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Book Title : ");
		String title = scan.nextLine();
		System.out.print("Input Year Book  : ");
		int year = scan.nextInt();
		
		FictionBook book = new FictionBook(title, year);
		scan.nextLine();
		System.out.print("Input Your Name  : ");
		String name = scan.nextLine();
		System.out.print("Input Your Email : ");
		String email = scan.nextLine();
		book.setAuthorName(name);
		book.setEmail(email);
		
		while(!book.checkFormatName() || !book.checkEmail()) {
			System.out.print("Input Your Name : ");
			name = scan.nextLine();
			System.out.print("Input Your Email : ");
			email = scan.nextLine();
			book.setAuthorName(name);
			book.setEmail(email);
		}
		System.out.println(book);
	}

}
