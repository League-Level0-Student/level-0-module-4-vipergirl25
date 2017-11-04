//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	// Initialize to zero.
	static int happiness = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
		String whatPet = JOptionPane.showInputDialog("What type of pet do you want to buy?");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 10; i++) {

			// 3. Use showOptionDialog to ask the user what they want to do to make their
			// pet happy
			// (eg: cuddle, food, water, take a walk, groom, clean up poop).
			// Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do make your pet happy?", whatPet, 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Walk", "Snuggle", "Play" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (task == 0) {
				walk();

			}
			if (task == 1) {
				snuggle();
			}
			if (task == 2) {
				play();
			}

			// 6. If you determine the happiness level is large enough, tell the
			// user that he loves his pet and use break; to exit for loop.
			if (happiness >= 5) {
				break;
			}
			System.out.println(happiness);
		}

	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	static void walk() {
		JOptionPane.showMessageDialog(null, "Your pet is happy!");
		happiness += 1;
		System.out.println(happiness);
	}

	static void snuggle() {
		JOptionPane.showMessageDialog(null, "Your pet rubs its head against your face in joy!");
		happiness += 1;
		System.out.println(happiness);
	}

	static void play() {
		JOptionPane.showMessageDialog(null, "Your pet wants to play fetch!");
		happiness += 1;
	}

	// and INCREMENT the pet's happiness Level.
}