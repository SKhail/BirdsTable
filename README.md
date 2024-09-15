# Bird Table Program

## Overview
The **Bird Table Program** is a simple Java project that uses Swing for graphical user interface (GUI) components to collect bird sightings. It takes inputs for different types of birds and their corresponding quantities, then visually represents this data in the form of a histogram using asterisks (`*`).

This project helps demonstrate the use of arrays, loops, exception handling, and basic GUI components in Java.

## Features
- Input for the number of birds for each bird type.
- Display the data in a table format using `JTextArea`.
- Represent the bird quantities in a simple histogram format using `*` symbols.
- Interactive GUI with `JOptionPane` for user inputs and outputs.
- Error handling to ensure valid inputs from the user.

## Technologies Used
- Java 11
- Swing (for GUI components)

## How It Works
1. The program initializes with a predefined list of bird types.
2. The user is prompted to input the number of sightings for each bird type using a dialog box.
3. The program stores the inputs in an integer array corresponding to each bird type.
4. After all inputs are gathered, the program displays the data:
   - A table showing the bird type and the quantity.
   - A histogram that visually represents the number of birds using asterisks (`*`).
5. The output is shown in a scrollable text area (`JScrollPane`) with a summary of the bird types and quantities.

## Code Structure
### `BirdTable.java`
- **`main()`**: The entry point of the program. This method handles user input and output logic.
- **Arrays**: The bird types are stored in a `String[]` array, and the number of sightings is stored in an `int[]` array.
- **JOptionPane**: Used for user interaction, collecting inputs, and displaying results.

### Example Flow:
1. The user is prompted:  
   `Please enter the number of Robins`
2. The user enters a number, say `5`.
3. The program continues this process for all bird types, collecting the
