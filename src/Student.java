// A class representing a student
public class Student {
    // Instance variables for student information and grades
    private String name; // Student name
    private String number; // Student number
    private int milestone1; // Grade for milestone 1
    private int milestone2; // Grade for milestone 2
    private int terminalAssessment; // Grade for terminal assessment
    private double totalGrade; // Total grade for the student

    // Constructor to initialize student object with provided information
    public Student(String name, String number, int milestone1, int milestone2, int terminalAssessment) {
        this.name = name; // Initialize name
        this.number = number; // Initialize number
        this.milestone1 = milestone1; // Initialize milestone1 grade
        this.milestone2 = milestone2; // Initialize milestone2 grade
        this.terminalAssessment = terminalAssessment; // Initialize terminalAssessment grade
        this.totalGrade = calculateTotalGrade(); // Calculate and initialize totalGrade
    }

    // Getter method for retrieving student name
    public String getName() {
        return name;
    }

    // Getter method for retrieving student number
    public String getNumber() {
        return number;
    }

    // Getter method for retrieving milestone1 grade
    public int getMilestone1() {
        return milestone1;
    }

    // Getter method for retrieving milestone2 grade
    public int getMilestone2() {
        return milestone2;
    }

    // Getter method for retrieving terminalAssessment grade
    public int getTerminalAssessment() {
        return terminalAssessment;
    }

    // Getter method for retrieving total grade
    public double getTotalGrade() {
        return totalGrade;
    }

    // Method to calculate total grade based on milestone and assessment grades
    private double calculateTotalGrade() {
        double gradeMilestone1 = milestone1;
        double gradeMilestone2 = milestone2;
        double gradeTerminalAssessment = terminalAssessment;
        return gradeMilestone1 + gradeMilestone2 + gradeTerminalAssessment;
    }
}
