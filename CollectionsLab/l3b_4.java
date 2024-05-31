import java.util.HashSet;
import java.util.Objects;

class Student {
    String studentName;
    int studentID;

    public Student(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return studentID == student.studentID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID);
    }
}

public class l3b_4 {
    public static void main(String[] args) {
        Student s1 = new Student("Akanksha", 1);
        Student s2 = new Student("Apurva", 2);
        Student s3 = new Student("sakshi", 3);
        Student s4 = new Student("Xyz", 1);

        HashSet<Student> ss = new HashSet<>();
        ss.add(s1);
        ss.add(s2);
        ss.add(s3);
        ss.add(s4);

        for (Student student : ss) {
            System.out.println("Student ID: " + student.studentID + ", Name: " + student.studentName);
        }
    }
}
