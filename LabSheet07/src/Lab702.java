import java.util.*;
import java.text.*;
public class Lab702 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#.00");
		Scanner scan = new Scanner(System.in);
		int j = 0;
		double[] scores = new double[5];
		double sum = 0, average = 0;
		for(int i = 0; i < scores.length; i++) {
			System.out.print("Input score of student "+(i + 1) + " : ");
			scores[i] = scan.nextDouble();
			sum += scores[i];
		}
		average = sum / scores.length;
		System.out.print("\nAverage of " + scores.length + " student is " + frm.format(average));
		for(double _scores:scores) {
			if(_scores>average) {
				System.out.print("\n> Student "+(j + 1) + " ("+_scores+")");
				j++;
			}
		}
	}

}
