

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			
		

		// 1. Get 2 numbers from the user and convert them to integer.
		String Number1 = JOptionPane.showInputDialog("Enter a number:");
		String Number2 = JOptionPane.showInputDialog("Enter another number:");
		int number1 = Integer.parseInt(Number1);
		int number2 = Integer.parseInt(Number2);

		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Operation?", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
				null);
		System.out.println(operation);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		if(operation==0) {
			add(number1,number2);
		}
		if(operation==1) {
			subtract(number1,number2);
		}
		if(operation==2) {
			multiply(number1,number2);
		}
		if(operation==3) {
			divide(number1,number2);
		}

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	static void add(int number1, int number2) {
		int answer = number1 + number2;
		JOptionPane.showMessageDialog(null, answer);
	}
	

	// 4. Create similar methods for subtraction, multiplication and division.
	static void subtract(int number1, int number2) {
		int answer = number1 - number2;
		JOptionPane.showMessageDialog(null, answer);
	}
	static void multiply(int number1, int number2) {
		int answer = number1*number2;
		JOptionPane.showMessageDialog(null, answer);
	}
	static void divide(int number1, int number2) {
		int answer = number1/number2;
		JOptionPane.showMessageDialog(null, answer);
	}

}