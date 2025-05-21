public class Classroom {
    private Student[] students;
    private int count;

    public Classroom() {
        students = new Student[10]; // max 10 students
        count = 0;
    }

    public void addStudent(Student s) {
        if (count < 10) {
            students[count++] = s;
        } else {
            System.out.println("Classroom is full.");
        }
    }

    public void updateAttendance(int studentId, int newDays) {
        boolean found = false;
		for (int i = 0; i < count; i++) {
            if (students[i].getStudentId() == studentId) {
                students[i].setDaysAttended(newDays);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student ID " + studentId + " not found.");
        }
    }

    public void displayAllStudents() {
        System.out.println("\nStudent Details:");
        for (int i = 0; i < count; i++) {
            Student s = students[i];
            System.out.println("ID: " + s.getStudentId() +
                               ", Name: " + s.getName() +
                               ", Days Attended: " + s.getDaysAttended());
        }
    }
}