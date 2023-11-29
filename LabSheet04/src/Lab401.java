import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		int x, y;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input value of X : ");
		x = scan.nextInt();
		System.out.print("Input value of Y : ");
		y = scan.nextInt();
		while(y < x) {
			System.out.print("Input value of Y, again : ");
			y = scan.nextInt();
		}
		System.out.println();
		for (int i = x+1; i<=y; i++) {
			System.out.print("\n" + x + " + " + i + " = " + (x = x + i));
		}
	}

}
