class Employee {

     String name ;
     int age;

     Employee(String name , int age) {

         this.name= name;
         this.age = age;

     }

     public String toString() {

          return name + "-" + age;

     }

      public boolean equals(Object obj) {

         Employee a = this;                         
         Employee b =(Employee) obj;     // parent ma child ko typecast kiya   // type cast in Employee b/c alpha class obj does not have name property

          String nm1 = a.name;
          String nm2 = b.name;

           return nm1.equals(nm2);

           // return this.name.equals((Employee)obj.name); 
      }
}