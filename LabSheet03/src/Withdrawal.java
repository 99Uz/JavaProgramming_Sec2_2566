import javax.swing.*;
import java.util.Random; //use library for random class
import java.text.*;
public class Withdrawal {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###");
		//using class Random for random money
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		//JOptionPane.showMessageDialog(null, "Your balance: ");
		int withdraw = Integer.parseInt(JOptionPane.showInputDialog("Your Balance : " + frm.format(balance) +
				"\nInput money to withdraw:"));
		int phan , hahroi , roi , sib = 0;
		phan = withdraw / 1000;
		hahroi = (withdraw % 1000) / 500;
		roi = (withdraw % 1000) / 100;
		sib = (withdraw - ((phan*1000)+(hahroi*500)+(roi*100)));
		
		if(withdraw > balance) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than balance");
		}
		else if(withdraw > 20000) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than 20,000");
		}
		else if((withdraw % 100) > 0) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw " + sib + " baht.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Your withdraw " + frm.format(withdraw) + " baht." +
		"\n1,000 = " + phan + "\n500 = " + hahroi + "\n100 = " + roi);
		}
	}

}
