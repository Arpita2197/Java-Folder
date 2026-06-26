class Student extends User {

    // String name;
    // int age;
     String college;
     String branch;
     String degree;
    // String phone;

     Student( String name,int age,String phone,String college,String branch,String degree) {
       
           super(name,age,phone);
        // this.name=name;
         //this.age=age;
         this.college=college;
         this.branch=branch;
         this.degree=degree;
        // this.phone=phone;

     }
}