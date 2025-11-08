package classesandobject;

import java.util.ArrayList;

public class School {
    private String name;
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;

    public School(String name){
        this.name = name;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }
    public void addStudent(Student student){
        students.add(student);
        System.out.println("Student "+student.getName()+" added successfully.✅");
    }
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
        System.out.println("Teacher "+teacher.getName()+" added successfully.✅");
    }
    public void showAllStudents(){
        System.out.println("\nList of all students:\n--------------------------------");
        for(Student student : students){
            student.display_info();
            System.out.println("--------------------------------");
        }
    }
    public void showAllTeachers(){
        System.out.println("\nList of all teachers:\n--------------------------------");
        for(Teacher teacher : teachers){
            teacher.display_info();
            System.out.println("--------------------------------");
        }
    }
}
