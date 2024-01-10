import java.util.*;
public class TestPiggyBank {
		static PiggyBank pb = new PiggyBank();
		static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		/*pb.setPiggyBank(500);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTwo (34);
		System.out.println("Add 2 Baht Money : " + 34);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTen (13);
		System.out.println("Add 10 Baht Money : " + 13);
		System.out.println("Money Total : " + pb.getTotal()); 
		pb.addFive(100);*/
		inputCoin();
	}
	
	public static void inputCoin() {
		System.out.println("Money Total : " + pb.getTotal());
		System.out.print("Please define size of PiggyBank: ");
		int sizeOfPiggyBank = scan.nextInt();
		pb.setPiggyBank(sizeOfPiggyBank);
		System.out.println("Money Total : " + pb.getPiggyBank());
		MainMenu();
	}
	
	public static void line() {
		System.out.println("========================");
	}
	
	public static void MainMenu() {
		while(true) {
			int value = 0;
			line();
			System.out.println("Menu of PiggyBank");
			line();
			System.out.println("[1] one baht."
							 + "\n[2] two baht."
							 + "\n[3] five baht."
							 + "\n[4] ten baht."
							 + "\n[5] Exit");
			line();
			System.out.print("Please Select Menu[1-5] : ");
			int select = scan.nextInt();
			if(select == 1) {
				value = 1;
			}
			else if(select == 2) {
				value = 2;
			}
			else if(select == 3) {
				value = 5;
			}
			else if(select == 4) {
				value = 10;
			}
			else {
				System.out.println("Bye Bye");
				break;
			}
			
			System.out.print("Insert " + value + " Baht Money: ");
			int insertOfMoney = scan.nextInt();
			
			if(select == 1) {
				pb.addOne(insertOfMoney);
			}
			else if(select == 2) {
				pb.addTwo(insertOfMoney);
			}
			else if(select == 3) {
				pb.addFive(insertOfMoney);
			}
			else if(select == 4) {
				pb.addTen(insertOfMoney);
			}
			
			if(pb.getTotal() <= pb.getPiggyBank()) {
				System.out.println("Money Total " + pb.getTotal());
			}
			
			System.out.println();
		}
	}
}
