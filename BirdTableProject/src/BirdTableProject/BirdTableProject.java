package BirdTableProject;

import javax.swing.*;

public class BirdTableProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Declare and build an array for bird types
        String[] typesOfBirds = {"Robin", "Sparrow", "Crow", "Pigeon", "Eagle", "Zuki"};
        
        // Array to store the quantity of birds for each type
        int[] birdQty = new int[typesOfBirds.length];
        
        // Loop through each bird type to get user input for the quantity
        for (int i = 0; i < typesOfBirds.length; i++) {
            // Display a prompt asking for the number of birds for each bird type
            String birdInput = JOptionPane.showInputDialog("Please enter the number of " + typesOfBirds[i]);

            try {
                // Convert the input to an integer and store it in birdQty
                int qty = Integer.parseInt(birdInput);
                birdQty[i] = qty;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                i--; // Re-ask the user for the same bird if the input is invalid
            }
        }

        // Building the output of data
        String output = "Bird Type\tCount\tHistogram\n";
        
        // Generating the histogram and adding the data to the output string
        for (int j = 0; j < typesOfBirds.length; j++) {
            output += typesOfBirds[j] + "\t" + birdQty[j] + "\t";
            
            // Append asterisks to represent the bird quantity
            for (int k = 0; k < birdQty[j]; k++) {
                output += "*";
            }
            output += "\n"; // New line after each bird entry
        }

        // Create a new text area to display the output
        JTextArea textArea = new JTextArea(output);
        textArea.setEditable(false); // User cannot edit the text

        // Make the text area scrollable
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Display the final output in a dialog
        JOptionPane.showMessageDialog(null, scrollPane, "Bird Table Program", JOptionPane.INFORMATION_MESSAGE);
        
        // Ending Message
        JOptionPane.showMessageDialog(null, "Ending BirdTable Program");
    }
	
}
