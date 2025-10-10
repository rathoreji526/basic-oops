package classesandobject;

public class Student {
    public int id;
    public String name;
    public String dob;
    public String grade;
    public String email;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", grade='" + grade + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
