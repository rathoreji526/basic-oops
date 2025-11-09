package classesandobject;

public class Student extends Person{
    private int roll_no;
    private String course;
    private int marks;


    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int calculate_avg(){
        return marks/5;
    }

    public void display_info(){
        System.out.println("Name: "+ getName()+" | Roll_no.: "+ getRoll_no() +" | Course: " +getCourse() + " | Marks: " + getMarks() +" | Age: " + getAge() + " | Gender: "+getGender());
    }
}
