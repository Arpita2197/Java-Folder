enum Days {      // Days as a datatype

    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY   // static final constants...
}

 class F {
          
          // ref var instance contex banata hai...
          
     Days x; // instance level hai... (jab tak static mark nhe ha toh matlb woh instance level hai+)

      public static void main(String[] args) {

         System.out.println(x);

      }
 }

//   C:\Users\lenovo\OneDrive\Desktop\java\52_enum>javac F.java
// F.java:12: error: non-static variable x cannot be referenced from a static context
//          System.out.println(x);
//                             ^
// 1 error