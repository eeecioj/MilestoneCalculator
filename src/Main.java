import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

// Main class for the grade calculator application
public class Main {
    public static void main(String[] args) {
        // Create a JFrame for the main window
        JFrame frame = new JFrame("Grade Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set default close operation
        frame.setSize(400, 300); // Set window size

        // Create a main panel with GridBagLayout
        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbcMain = new GridBagConstraints(); // Constraints for main panel
        gbcMain.gridx = 0; // Grid x position
        gbcMain.gridy = 0; // Grid y position

        // Create a panel for student information with GridLayout
        JPanel panel = new JPanel(new GridLayout(0, 2)); // 2 columns, dynamic rows
        panel.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align the panel

        // Create labels and text fields for student information
        JLabel lblStudentName = new JLabel("Student Name:"); // Label for student name
        JTextField txtStudentName = new JTextField(20); // Text field for student name
        JLabel lblStudentNo = new JLabel("Student No:"); // Label for student number
        JTextField txtStudentNo = new JTextField(20); // Text field for student number
        JLabel lblMilestone1 = new JLabel("Milestone 1: "); // Label for milestone 1
        JTextField txtMilestone1 = new JTextField(10); // Text field for milestone 1
        JLabel lblMilestone2 = new JLabel("Milestone 2: "); // Label for milestone 2
        JTextField txtMilestone2 = new JTextField(10); // Text field for milestone 2
        JLabel lblTerminalAssessment = new JLabel("Terminal Assessment: "); // Label for terminal assessment
        JTextField txtTerminalAssessment = new JTextField(10); // Text field for terminal assessment

        // Add labels and text fields to the panel
        panel.add(lblStudentName);
        panel.add(txtStudentName);
        panel.add(lblStudentNo);
        panel.add(txtStudentNo);
        panel.add(lblMilestone1);
        panel.add(txtMilestone1);
        panel.add(lblMilestone2);
        panel.add(txtMilestone2);
        panel.add(lblTerminalAssessment);
        panel.add(txtTerminalAssessment);

        // Add the panel to the main panel with constraints
        mainPanel.add(panel, gbcMain);

        // Create a "Calculate" button
        JButton btnCalculate = new JButton("Calculate");

        // Create an ActionListener for the button using CalculateButton class
        ActionListener buttonHandler = new CalculateButton(txtMilestone1, txtMilestone2, txtTerminalAssessment, frame);
        btnCalculate.addActionListener(buttonHandler);

        // Constraints for the button
        GridBagConstraints gbcButton = new GridBagConstraints();
        gbcButton.gridx = 0; // Grid x position
        gbcButton.gridy = 1; // Grid y position
        gbcButton.anchor = GridBagConstraints.CENTER; // Anchor to center
        gbcButton.insets = new Insets(10, 0, 0, 0); // Insets (top, left, bottom, right)
        mainPanel.add(btnCalculate, gbcButton);

        // Add the button to the main panel with constraints
        frame.add(mainPanel);
        frame.setLocationRelativeTo(null); // Set frame location to center of screen
        frame.setVisible(true); // Make the frame visible
    }
}
