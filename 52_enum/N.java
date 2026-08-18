   enum Days {

     SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
 }

 class N {

          public static void main(String[] args) {

             Days[] all = Days.values(); // enum ma iterate karna ka liya inbuilt method (values()) use kiya enum ka....

             for(Days next : all) {

                 System.out.println(next);
             }

          }

 }
