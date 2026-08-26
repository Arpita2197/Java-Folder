import java.util.Date;

class Student2 extends User1 {

    public String name  = "ram";
     private int age = 10;
     public float marks;
     Date dob;

    public static int maxAge = 90;

    public Student2(String name, int age, float marks, Date dob) {

        this.name=name;
        this.age=age;
        this.marks = marks;
        this.dob=dob;
    }

}