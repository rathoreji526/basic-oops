package com.oops_kk;

public class Student {
    int id;
    int r_no;
    String add;
    static int age;

    public Student() {
    }

    public Student(int id, int r_no, String add) {
        this.id = id;
        this.r_no = r_no;
        this.add = add;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", r_no=" + r_no +
                ", add='" + add + '\'' +
                '}';
    }
}
