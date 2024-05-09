import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grade Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbcMain = new GridBagConstraints();
        gbcMain.gridx = 0;
        gbcMain.gridy = 0;

        JPanel panel = new JPanel(new GridLayout(0, 2));
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel lblStudentName = new JLabel("Student Name:");
        JTextField txtStudentName = new JTextField(20);
        JLabel lblStudentNo = new JLabel("Student No:");
        JTextField txtStudentNo = new JTextField(20);
        JLabel lblMilestone1 = new JLabel("Milestone 1: ");
        JTextField txtMilestone1 = new JTextField(10);
        JLabel lblMilestone2 = new JLabel("Milestone 2: ");
        JTextField txtMilestone2 = new JTextField(10);
        JLabel lblTerminalAssessment = new JLabel("Terminal Assessment: ");
        JTextField txtTerminalAssessment = new JTextField(10);

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

        mainPanel.add(panel, gbcMain);

        JButton btnCalculate = new JButton("Calculate");

        ActionListener buttonHandler = new CalculateButton(txtMilestone1, txtMilestone2, txtTerminalAssessment, frame);
        btnCalculate.addActionListener(buttonHandler);

        GridBagConstraints gbcButton = new GridBagConstraints();
        gbcButton.gridx = 0;
        gbcButton.gridy = 1;
        gbcButton.anchor = GridBagConstraints.CENTER;
        gbcButton.insets = new Insets(10, 0, 0, 0);
        mainPanel.add(btnCalculate, gbcButton);

        frame.add(mainPanel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
