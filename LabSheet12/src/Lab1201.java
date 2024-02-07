import java.util.*;
import java.io.*;
public class Lab1201 {

	public static void main(String[] args) throws IOException{
		Scanner readFile = new Scanner(new File("D://txtFile//MemberLogin.txt"));
		while(readFile.hasNext()) {
			String fname = readFile.next();
			String lname = readFile.next();
			readFile.next();
			String email = readFile.next().toUpperCase();
			String _name = lname.substring(0,1).toUpperCase() + "." + fname;
			System.out.println(_name + " (" + email + ")");
		}
		readFile.close();
	}

}
