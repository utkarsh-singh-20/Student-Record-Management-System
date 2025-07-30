import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentManagementSystem {
    private List<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void updateStudent(int id, String name, int age, String course) {
        Optional<Student> optionalStudent = students.stream()
                .filter(s -> s.getId() == id)
                .findFirst();

        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            student.setName(name);
            student.setAge(age);
            student.setCourse(course);
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public void deleteStudent(int id) {
        boolean removed = students.removeIf(s -> s.getId() == id);
        if (removed) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public void viewStudent(int id) {
        Optional<Student> optionalStudent = students.stream()
                .filter(s -> s.getId() == id)
                .findFirst();

        if (optionalStudent.isPresent()) {
            System.out.println(optionalStudent.get());
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            students.forEach(System.out::println);
        }
    }
}
