public class Student {
    private String name;
    private String number;
    private int milestone1;
    private int milestone2;
    private int terminalAssessment;
    private double totalGrade;

    // Constructor
    public Student(String name, String number, int milestone1, int milestone2, int terminalAssessment) {
        this.name = name;
        this.number = number;
        this.milestone1 = milestone1;
        this.milestone2 = milestone2;
        this.terminalAssessment = terminalAssessment;
        this.totalGrade = calculateTotalGrade();
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public int getMilestone1() {
        return milestone1;
    }

    public int getMilestone2() {
        return milestone2;
    }

    public int getTerminalAssessment() {
        return terminalAssessment;
    }

    public double getTotalGrade() {
        return totalGrade;
    }

    // Calculate total grade
    private double calculateTotalGrade() {
        double gradeMilestone1 = milestone1 * 0.25;
        double gradeMilestone2 = milestone2 * 0.40;
        double gradeTerminalAssessment = terminalAssessment * 0.35;
        return gradeMilestone1 + gradeMilestone2 + gradeTerminalAssessment;
    }
}
