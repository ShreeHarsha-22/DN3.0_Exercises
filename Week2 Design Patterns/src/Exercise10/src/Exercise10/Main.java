package Exercise10;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Main class to test the MVC implementation
public class Main {
    public static void main(String[] args) {
        // Create a Student object (Model)
        Student student = new Student("John Doe", 1, "A");

        // Create a StudentView object (View)
        StudentView studentView = new StudentView();

        // Create a StudentController object (Controller)
        StudentController studentController = new StudentController(student, studentView);

        // Display student details
        studentController.updateView();

        // Update student details
        studentController.setStudentName("Jane Smith");
        studentController.setStudentGrade("B");

        // Display updated student details
        studentController.updateView();
    }
}
