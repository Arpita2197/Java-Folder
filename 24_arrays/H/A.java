class A {

     public static void main(String[] args) {

         Student[] x = new Student[4];

          System.out.println(x[0] instanceof String); 
     }
}

//  A.java:7: error: incompatible types: Student cannot be converted to String
//           System.out.println(x[0] instanceof String);
//                               ^
// 1 error