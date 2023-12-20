import javax.swing.*;
public class Lab601 {

	public static void main(String[] args) {
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail:").toLowerCase();
		//inputEmail = inputEmail().toLowerCase();
		boolean checkEmail = checkEmail(inputEmail);
		displayEmail(checkEmail, inputEmail);
	}//end main()
	
	public static boolean checkEmail(String email) {
		if(email.endsWith("hotmail.com") || email.endsWith("gmail.com")) {
			return true;
		}
		else {
			return false;
		}
	}//end checkEmail()
	
	public static void displayEmail(boolean checkEmail, String inputEmail) {
		if(checkEmail == true) {
			JOptionPane.showMessageDialog(null, "Your e-mail is " + inputEmail);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail");
		}
	}
}
