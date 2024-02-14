import java.io.*;
import java.util.*;
public class SentenceText {

	public static void main(String[] args) throws IOException{
		// create object for write(save) data to File using PrintStream Class
		PrintStream writeFile = new PrintStream(new File("D://txtFile//sentence.txt"));
		// create object for input data from keyboard(console)
		Scanner scan = new Scanner(System.in);
		int i = 1;
		while(true) {
			System.out.print("Sentence:");
			String word = scan.next().toUpperCase();
			
			if(word.equalsIgnoreCase("stop")) {
				break;
			}
			//save data to file
			writeFile.println(i + ":" + word);
			i++;
		}
		System.out.println("File is save!!");
		
		writeFile.close();
	}

}
