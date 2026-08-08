class User implements Comparable<User>  {

     String name;
     int age;

      User(String name , int age) {

         this.name=name;
         this.age=age;
     }

      public String toString() {

         return name + "--" + age;  
         
      }

       public int compareTo(User obj) {

          return this.name.compareTo(obj.name);
       } 

}