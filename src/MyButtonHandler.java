import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// ActionListener implementation for calculating total grade
class CalculateButton implements ActionListener {
    // Instance variables for text fields and frame
    private final JTextField txtMilestone1; // Text field for milestone 1 grade
    private final JTextField txtMilestone2; // Text field for milestone 2 grade
    private final JTextField txtTerminalAssessment; // Text field for terminal assessment grade
    private final JFrame frame; // JFrame associated with the button

    // Constructor to initialize the CalculateButton object with required components
    public CalculateButton(JTextField txtMilestone1, JTextField txtMilestone2, JTextField txtTerminalAssessment, JFrame frame) {
        this.txtMilestone1 = txtMilestone1; // Initialize milestone 1 text field
        this.txtMilestone2 = txtMilestone2; // Initialize milestone 2 text field
        this.txtTerminalAssessment = txtTerminalAssessment; // Initialize terminal assessment text field
        this.frame = frame; // Initialize frame
    }

    // Action performed when the button is clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Parse integer grades from text fields
            int milestone1 = Integer.parseInt(txtMilestone1.getText()); // Get milestone 1 grade
            int milestone2 = Integer.parseInt(txtMilestone2.getText()); // Get milestone 2 grade
            int terminalAssessment = Integer.parseInt(txtTerminalAssessment.getText()); // Get terminal assessment grade

            // Calculate total grade
            double totalGrade = milestone1 + milestone2 + terminalAssessment;

            // Display total grade in a message dialog
            JOptionPane.showMessageDialog(frame, "Total Grade: " + totalGrade, "Result", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            // Handle exception if input is not a valid integer
            JOptionPane.showMessageDialog(frame, "Invalid input. Please enter valid integer grades.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
