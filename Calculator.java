import javax.swing.JOptionPane;
public class Calculator {
	public static void main(String[] args) {
		String a, b;
		a = JOptionPane.showInputDialog(null, 
				"Please enter the first number:", "First number",
				JOptionPane.INFORMATION_MESSAGE);
		b = JOptionPane.showInputDialog(null, 
				"Please enter the second number:", "Second number",
				JOptionPane.INFORMATION_MESSAGE);
		double sum, dif, pro, quo;
		double num1 = Double.parseDouble(a);
		double num2 = Double.parseDouble(b);
		sum = num1 + num2;
		dif = num1 - num2;
		pro = num1 * num2;
		if (num2 == 0)
			JOptionPane.showMessageDialog(null, "Error, cannot calculate the division with zero.");
		else {
			quo = num1 / num2;
			JOptionPane.showMessageDialog(null, "Sum = " + sum + ".\nDifference = " + dif
					+ ".\nProduct = " + pro + ".\nQuotation = " + quo + ".");
		}
		System.exit(0);
	}
}
