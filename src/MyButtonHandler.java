import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// ActionListener implementation for calculating total grade
class CalculateButton implements ActionListener {
    // Instance variables for text fields, frame, student name, and student number
    private final JTextField txtMilestone1; // Text field for milestone 1 grade
    private final JTextField txtMilestone2; // Text field for milestone 2 grade
    private final JTextField txtTerminalAssessment; // Text field for terminal assessment grade
    private final JTextField txtStudentName; // Text field for student name
    private final JTextField txtStudentNo; // Text field for student number
    private final JFrame frame; // JFrame associated with the button

    // Constructor to initialize the CalculateButton object with required components
    public CalculateButton(JTextField txtMilestone1, JTextField txtMilestone2, JTextField txtTerminalAssessment,
                           JTextField txtStudentName, JTextField txtStudentNo, JFrame frame) {
        this.txtMilestone1 = txtMilestone1; // Initialize milestone 1 text field
        this.txtMilestone2 = txtMilestone2; // Initialize milestone 2 text field
        this.txtTerminalAssessment = txtTerminalAssessment; // Initialize terminal assessment text field
        this.txtStudentName = txtStudentName; // Initialize student name text field
        this.txtStudentNo = txtStudentNo; // Initialize student number text field
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

            // Get student name and number from text fields
            String studentName = txtStudentName.getText(); // Get student name
            String studentNo = txtStudentNo.getText(); // Get student number

            // Calculate total grade
            double totalGrade = milestone1 + milestone2 + terminalAssessment;

            // Construct message string for the dialog
            String message = "Student Name: " + studentName + "\n" +
                    "Student Number: " + studentNo + "\n" +
                    "Milestone 1: " + milestone1 + "\n" +
                    "Milestone 2: " + milestone2 + "\n" +
                    "Terminal Assessment: " + terminalAssessment + "\n\n" +
                    "Total Grade: " + totalGrade;

            // Display total grade along with additional student information in a message dialog
            JOptionPane.showMessageDialog(frame, message, "Result", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            // Handle exception if input is not a valid integer
            JOptionPane.showMessageDialog(frame, "Invalid input. Please enter valid integer grades.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
