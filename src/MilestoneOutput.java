import javax.swing.*;
import java.awt.*;

public class MilestoneOutput {
    private JFrame frame;

    public MilestoneOutput(Student stud) {
        frame = new JFrame("Milestone Output");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel(new GridLayout(0, 2));

        JTextField txtStudentName = new JTextField(stud.getName());
        txtStudentName.setEditable(false);
        JTextField txtStudentNo = new JTextField(stud.getNumber());
        txtStudentNo.setEditable(false);
        JTextField txtMilestone1 = new JTextField(String.valueOf(stud.getMilestone1()));
        txtMilestone1.setEditable(false);
        JTextField txtMilestone2 = new JTextField(String.valueOf(stud.getMilestone2()));
        txtMilestone2.setEditable(false);
        JTextField txtTerminalAssessment = new JTextField(String.valueOf(stud.getTerminalAssessment()));
        txtTerminalAssessment.setEditable(false);
        JTextField txtTotalGrade = new JTextField(String.valueOf(stud.getTotalGrade()));
        txtTotalGrade.setEditable(false);

        panel.add(new JLabel("Student Name:"));
        panel.add(txtStudentName);
        panel.add(new JLabel("Student Number:"));
        panel.add(txtStudentNo);
        panel.add(new JLabel("Milestone 1:"));
        panel.add(txtMilestone1);
        panel.add(new JLabel("Milestone 2:"));
        panel.add(txtMilestone2);
        panel.add(new JLabel("Terminal Assessment:"));
        panel.add(txtTerminalAssessment);
        panel.add(new JLabel("Total Grade:"));
        panel.add(txtTotalGrade);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
