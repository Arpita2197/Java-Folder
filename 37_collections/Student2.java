class Student2 {
     
     String name;
     int age;

     Student2(String name , int age) {

         this.name=name;
         this.age=age;
     }

      public String toString() {        // alpha class Object ka method ha

          return name + "-" + age;
      }

       public boolean equals(Object obj) {         // obj var alpha class Object ki tarah behave karna laga jisma name var nhe ha

         return this.name.equals(((Student2)obj).name);       // typecast kiya ha (Student2)obj
         
         
           }
}