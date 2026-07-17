class Q2 {

    public static void main(String[] args) {
        String name = "Vikram Singh";
        int age = 19;
        float marks = 91.34f;
           
      //  String x = "My name is :" + name + "and My age is :" + age + " and My marks: " + marks;

       String x = String.format("My name is : %s + and My age is : %s  +  and My marks: %s ", name,age,marks );


         System.out.println(x);


 

    }
}
