class Employee {

     String name;
     int age;

     Employee(String name, int age) {

         this.name = name;
         this.age = age;

     }

      public boolean equals (Object obj) {

          Employee a = this;
          Employee b = (Employee)obj;

           String n1 = a.name;
           String n2 = b.name;                                                      

           int ag1 = a.age;
           int ag2 = b.age;

           return n1.equals(n2) &&  ag1==ag2;
 
      } 
}

