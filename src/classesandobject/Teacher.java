package classesandobject;

public class Teacher extends Person{
    private int employee_id;
    private String subject;
    private int salary;


    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


//    public void display_info() {
//        System.out.println( "Teacher{" +
//                "employee_id=" + employee_id +
//                ", subject='" + subject + '\'' +
//                ", salary=" + salary +
//                '}'
//        );
//    }
        public void display_info() {
        System.out.println("Name :" + getName() + "Age :" + getAge() + "Gender :" + getGender() + "ID" + getEmployee_id() + "Subject" + getSubject()+ "Salary" + getSalary());
    }
}
