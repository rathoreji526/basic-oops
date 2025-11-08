import classesandobject.Person;
import classesandobject.School;
import classesandobject.Student;

import javax.xml.transform.sax.SAXResult;

public class Main{
    public static void main(String[] args){
        School school = new School("HSB");

        //s1
        Student s1 = new Student();
        s1.setName("Kamal Rathore");
        s1.setAge(22);
        s1.setCourse("BCA");
        s1.setMarks(77);
        s1.setGender("Male");
        s1.setRoll_no(101);

        //s2
        Student s2 = new Student();
        s2.setName("Rohit Kumar");
        s2.setRoll_no(102);
        s2.setAge(21);
        s2.setGender("Male");
        s2.setCourse("BBA");
        s2.setMarks(79);

        //s3
        Student s3 = new Student();
        s3.setName("Aastha Singh");
        s3.setRoll_no(103);
        s3.setAge(22);
        s3.setGender("Female");
        s3.setCourse("BA");
        s3.setMarks(85);


        school.addStudent(s1);
        school.addStudent(s2);
        school.addStudent(s3);
        school.showAllStudents();

    }
}