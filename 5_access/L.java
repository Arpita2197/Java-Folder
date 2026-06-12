class student extends pen {              // iS-A ACCESS

     public static void main(String[] args) {

          student x = new student();

           x.write();         
     }
}

class pen {

     void write() {

         System.out.println("write()");
     }
}