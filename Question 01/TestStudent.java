public class TestStudent {
    public static void main(String[] args) {
        Classroom classRoom = new Classroom();

        // Add 3 students
        classRoom.addStudent(new Student(101, "Alice Smith", 12));
        classRoom.addStudent(new Student(102, "Bob Jones", 15));
        classRoom.addStudent(new Student(103, "Carol Lee", 10));

        // Update Bob Jones attendance to 16
        classRoom.updateAttendance(102, 16);

        // Attempt to update a non-existent student (ID 104)
		classRoom.updateAttendance(104, 5);

        // Display all student details
        classRoom.displayAllStudents();
    }
}