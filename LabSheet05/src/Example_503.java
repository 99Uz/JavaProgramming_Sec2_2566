import java.util.*;
public class Example_503 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1.Input data from console(keyboard)
		System.out.print("Input a sentence: ");
		String sentence = scan.nextLine();
		//2.Check sentence end with . or not
		while(!sentence.endsWith(".")) {
			System.out.print("Input a sentence,again: ");
			sentence = scan.nextLine();
		}
		int countSpace = 0;
		for(int i = 0; i < sentence.length() - 1; i++) {
			if (sentence.charAt(i) == ' ') {
				countSpace += 1;
			}
		}
		System.out.println("\nThis sentence has " + countSpace + " spacebar.");
		System.out.println("This sentence has " + (countSpace+1) + " word.");
	}

}
