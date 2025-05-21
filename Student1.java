class Student1 {
    private String name;
    private int exam1;
    private int exam2;
    private int exam3;

    // Constructor
    Student1(String name, int exam1, int exam2, int exam3) {
        this.name = name;
        setExam1(exam1); // Use setter for validation
        setExam2(exam2); // Use setter for validation
        setExam3(exam3); // Use setter for validation
    }

    // Helper method for input validation
    private void validateExamScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Exam scores must be between 0 and 100.");
        }
    }

    // Getter methods
    String getName() {
        return name;
    }

    int getExam1() {
        return exam1;
    }

    int getExam2() {
        return exam2;
    }

    int getExam3() {
        return exam3;
    }

    // Setter methods with validation (though not explicitly asked for in the problem,
    // it's good practice if you intend to modify scores after object creation)
    void setExam1(int exam1) {
        validateExamScore(exam1);
        this.exam1 = exam1;
    }

    void setExam2(int exam2) {
        validateExamScore(exam2);
        this.exam2 = exam2;
    }

    void setExam3(int exam3) {
        validateExamScore(exam3);
        this.exam3 = exam3;
    }

    // Method to calculate average
    double calculateAverage() {
        return (exam1 + exam2 + exam3) / 3.0;
    }

    public static void main(String[] args) {
        // Main method for testing
        // Use try-catch to create a Student object
        try {
            Student1 john = new Student1("John", 75, 110, 90); // 110 is an invalid score
            System.out.println("Student created successfully!");
            System.out.println("Student Name: " + john.getName());
            System.out.printf("Average Exam Score: %.2f%n", john.calculateAverage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n--- Testing with valid scores ---");
        try {
            Student1 jane = new Student1("Jane", 85, 92, 78);
            System.out.println("Student created successfully!");
            System.out.println("Student Name: " + jane.getName());
            System.out.printf("Average Exam Score: %.2f%n", jane.calculateAverage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}