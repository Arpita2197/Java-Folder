class C {

     public static void main (String[] args) {

         try {
             

         }catch(NumberFormatException e) {

         }catch(ArithmeticException e) {

         }

         finally {

             
         }catch(ArrayIndexOutOfBoundsException e) {       // finally ka baad catch nhe likh sakta...


         }
     }
}

//  C.java:17: error: 'catch' without 'try'
//          }catch(ArrayIndexOutOfBoundsException e) {
//           ^
// 1 error