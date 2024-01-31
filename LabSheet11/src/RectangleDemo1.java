import javax.swing.*;
public class RectangleDemo1 {

	public static void main(String[] args) {
		//input width,length,color from dialog box
		double widthInput = Double.parseDouble(JOptionPane.showInputDialog("Input width:"));
		double lengthInput = Double.parseDouble(JOptionPane.showInputDialog("Input length:"));

		
		//send all data to constructor from Rectangle class
		/*Rectangle obj1 = new Rectangle(widthInput,lengthInput,colorInput);
		
		JOptionPane.showMessageDialog(null, obj1.toString() + "\nArea of Rectangle is " + obj1.getArea());*/
		
		Rectangle2 obj2 = new Rectangle2(widthInput,lengthInput);
		JOptionPane.showMessageDialog(null, obj2.toString() + "\nArea of Rectangle is " + obj2.getArea());
	}

}
