enum Days {      // Days as a data - type

    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY      // static final constants...
}

 class G {

    static Days x = SUNDAY;  // ham data type Days ma value initialize kar raha ha..

      public static void main(String[] args) {

         System.out.println(x);

      }
 }

//   G.java:8: error: cannot find symbol
//     static Days x = SUNDAY;  // ham data type Days ma value initialize kar raha ha..
//                     ^
//   symbol:   variable SUNDAY
//   location: class G
// 1 error
