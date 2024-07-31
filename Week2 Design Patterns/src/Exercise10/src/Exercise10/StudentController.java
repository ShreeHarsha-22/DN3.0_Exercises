package Exercise10;

// Define the Controller class
public class StudentController {
    private Student model;
    private StudentView view;

    // Constructor
    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    // Set student name
    public void setStudentName(String name) {
        model.setName(name);
    }

    // Get student name
    public String getStudentName() {
        return model.getName();
    }

    // Set student ID
    public void setStudentId(int id) {
        model.setId(id);
    }

    // Get student ID
    public int getStudentId() {
        return model.getId();
    }

    // Set student grade
    public void setStudentGrade(String grade) {
        model.setGrade(grade);
    }

    // Get student grade
    public String getStudentGrade() {
        return model.getGrade();
    }

    // Update view
    public void updateView() {
        view.displayStudentDetails(model.getName(), model.getId(), model.getGrade());
    }
}

