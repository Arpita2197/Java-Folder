enum Days {      // Days as a data - type

    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY      // static final constants...
}

 class I {

    static Days x = Days.StudentDAY;   // jo values pre defined ha bss unko hee initilaze kar sakta hai...

      public static void main(String[] args) {

         System.out.println(x);

      }
 }

//   I.java:8: error: cannot find symbol
//     static Days x = Days.StudentDAY;
//                         ^
//   symbol:   variable StudentDAY
//   location: class Days
// 1 error