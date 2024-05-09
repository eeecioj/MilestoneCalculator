import javax.swing.*;
import java.awt.*;

// A class for displaying student milestone output
public class MilestoneOutput {
    private JFrame frame; // JFrame for the main window

    // Constructor that takes a Student object as input
    public MilestoneOutput(Student stud) {
        frame = new JFrame("Milestone Output"); // Create a new JFrame with title "Milestone Output"
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Set default close operation
        frame.setSize(400, 300); // Set window size

        JPanel panel = new JPanel(new GridLayout(0, 2)); // Create a JPanel with grid layout

        // Create JTextFields for displaying student information and milestone grades
        JTextField txtStudentName = new JTextField(stud.getName()); // Student name
        txtStudentName.setEditable(false); // Make it non-editable
        JTextField txtStudentNo = new JTextField(stud.getNumber()); // Student number
        txtStudentNo.setEditable(false); // Make it non-editable
        JTextField txtMilestone1 = new JTextField(String.valueOf(stud.getMilestone1())); // Milestone 1 grade
        txtMilestone1.setEditable(false); // Make it non-editable
        JTextField txtMilestone2 = new JTextField(String.valueOf(stud.getMilestone2())); // Milestone 2 grade
        txtMilestone2.setEditable(false); // Make it non-editable
        JTextField txtTerminalAssessment = new JTextField(String.valueOf(stud.getTerminalAssessment())); // Terminal assessment grade
        txtTerminalAssessment.setEditable(false); // Make it non-editable
        JTextField txtTotalGrade = new JTextField(String.valueOf(stud.getTotalGrade())); // Total grade
        txtTotalGrade.setEditable(false); // Make it non-editable

        // Add labels and corresponding text fields to the panel
        panel.add(new JLabel("Student Name:")); // Label for student name
        panel.add(txtStudentName); // Text field for student name
        panel.add(new JLabel("Student Number:")); // Label for student number
        panel.add(txtStudentNo); // Text field for student number
        panel.add(new JLabel("Milestone 1:")); // Label for milestone 1
        panel.add(txtMilestone1); // Text field for milestone 1
        panel.add(new JLabel("Milestone 2:")); // Label for milestone 2
        panel.add(txtMilestone2); // Text field for milestone 2
        panel.add(new JLabel("Terminal Assessment:")); // Label for terminal assessment
        panel.add(txtTerminalAssessment); // Text field for terminal assessment
        panel.add(new JLabel("Total Grade:")); // Label for total grade
        panel.add(txtTotalGrade); // Text field for total grade

        frame.add(panel); // Add the panel to the frame
        frame.setLocationRelativeTo(null); // Set frame location to center of screen
        frame.setVisible(true); // Set frame location to center of screen
    }
}
