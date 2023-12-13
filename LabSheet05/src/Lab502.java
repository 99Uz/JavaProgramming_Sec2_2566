import java.util.*;
public class Lab502 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String sentence = scan.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("the sentence must end with full stop point : ");
			sentence = scan.nextLine();
		}
		System.out.println();
		int countSpace = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == ' ' || i == sentence.length() - 1) {
				System.out.println(sentence.substring(countSpace,i+1).trim());
				countSpace = i;
			}
		}
	}

}
