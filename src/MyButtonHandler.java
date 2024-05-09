import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculateButton implements ActionListener {
    private final JTextField txtMilestone1;
    private final JTextField txtMilestone2;
    private final JTextField txtTerminalAssessment;
    private final JFrame frame;

    public CalculateButton(JTextField txtMilestone1, JTextField txtMilestone2, JTextField txtTerminalAssessment, JFrame frame) {
        this.txtMilestone1 = txtMilestone1;
        this.txtMilestone2 = txtMilestone2;
        this.txtTerminalAssessment = txtTerminalAssessment;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int milestone1 = Integer.parseInt(txtMilestone1.getText());
            int milestone2 = Integer.parseInt(txtMilestone2.getText());
            int terminalAssessment = Integer.parseInt(txtTerminalAssessment.getText());
            double totalGrade = milestone1 + milestone2 + terminalAssessment;
            JOptionPane.showMessageDialog(frame, "Total Grade: " + totalGrade, "Result", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Invalid input. Please enter valid integer grades.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
