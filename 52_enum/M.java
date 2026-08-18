enum CoffeMugSize {

    SMALL,MEDIUM,LARGE;
}

class M {

     public static void main(String[] args) {

         CoffeMugSize x = new CoffeMugSize();
     }
}

      // enum ka OBJECT  nhe bana sakta....
      
//  C:\Users\lenovo\OneDrive\Desktop\java\52_enum>javac M.java
// M.java:10: error: enum types may not be instantiated
//          CoffeMugSize x = new CoffeMugSize();
//                           ^
// 1 error