class Student {

    String name;
    int age;
}

class Q {

    public static void main(String[] args) {

         Student x = new Student();

          System.out.println(x.name);
          System.out.println(x.age);

           x.name = "vikas";
           x.age = 15;

           System.out.println(x.name);
          System.out.println(x.age);

    }
}