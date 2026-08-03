class Employee1 {

     String name ;
     int age;

     Employee1(String name , int age) {

         this.name= name;
         this.age = age;

     }

     public String toString() {

          return name + "-" + age;

     }

      public boolean equals(Object obj) {

         boolean flag = false;

         if(obj instanceof Employee1) {       // instanceof means parent-child relation
  
         Employee1 a = this;                         
         Employee1 b =(Employee1) obj;     

          String nm1 = a.name;
          String nm2 = b.name;

           return nm1.equals(nm2);

              }
      

           return flag;
      }
}