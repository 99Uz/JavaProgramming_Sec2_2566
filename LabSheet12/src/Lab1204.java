import java.io.*;
import java.util.*;
public class Lab1204 {

	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		BufferedReader readFile = new BufferedReader(new FileReader("D://txtFile//BookData.txt"));
		String tmp = "";
		System.out.print("Enter rating of book : ");
		float inputRating = scan.nextFloat();
		int countBook = 0, bookNumber = 1;
		Header();
		while((tmp = readFile.readLine()) != null){
			String[] data = tmp.split("\t");
			String title = data[0];
			String author = data[1];
			float rating = Float.parseFloat(data[2]);
			int review = Integer.parseInt(data[3]);
			if(rating >= inputRating) {
				System.out.println("Book " + bookNumber + "write by " + author + " (" + review + ") reviews");
				bookNumber++;
			}
			countBook++;
		}
		readFile.close();
		Header();
		System.out.println("There are " + countBook + " book get rating more than " + inputRating);
	}
	
	public static void Header() {
		System.out.println("--------------------------------------------");
	}
}
