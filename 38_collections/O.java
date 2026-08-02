class O {

     public static void main (String [] args) {

         Employee x = new Employee("hitesh" , 23);
         Employee y = new Employee ("hitesh",22);
         Student z = new Student("hitesh" , 18);


        //  System.out.println(x.equals(y));     // true
         
            System.out.println(x.equals(z));
           

     }
}

 
// Exception in thread "main" java.lang.ClassCastException: class Student cannot be cast to class Employee (Student and Employee are in unnamed module of loader 'app')
//         at Employee.equals(Employee.java:22)
//         at O.main(O.java:12)
