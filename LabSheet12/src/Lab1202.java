import java.util.*;
import java.io.*;
public class Lab1202 {

	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Your Email : ");
		String email = scan.next();
		BufferedReader readFile = new BufferedReader(new FileReader("D://txtFile//student.txt"));
		String tmp = "";
		while((tmp = readFile.readLine()) != null) {
			String[] data = tmp.split("\t");
			String password = data[2];
			String email_ = data[3];
			if(email.equalsIgnoreCase(email_)) {
				System.out.println("Your password is " + password);
			}
			else {
				System.out.println("The data is not found...");
			}
		}
		readFile.close();
	}

}
