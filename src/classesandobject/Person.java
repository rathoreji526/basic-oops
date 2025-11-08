package classesandobject;

public class Person {
    private String name;
    private int age;
    private String gender;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


//    public void display_info() {
//        System.out.println( "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", gender='" + gender + '\'' +
//                '}'
//        );
//    }

        public void display_info(){
        System.out.println("Name :"+ name +"Age :" + age + "Gender :"+gender);
    }
}
