class Teacher extends User {

    String designation;
    int experience;
    float salary;
   // String name;
   // int age;
   // String phone;

    Teacher(String name,int age,String phone,String designation , int experience , float salary) {

         super(name,age,phone);

         this.designation=designation;
         this.experience=experience;
         this.salary=salary;
       //  this.name=name;
       //  this.age=age;
       //  this.phone=phone;
    }

}