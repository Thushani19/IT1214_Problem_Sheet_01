public class Student {
    private int studentId;
    private String name;
    private int daysAttended;

    // Constructor
    public Student(int studentId, String name, int daysAttended) {
        this.studentId = studentId;
        this.name = name;
        this.daysAttended = daysAttended;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getDaysAttended() {
        return daysAttended;
    }

    // Setters
    public void setDaysAttended(int daysAttended) {
        this.daysAttended = daysAttended;
    }
}