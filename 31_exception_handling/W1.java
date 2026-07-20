    
     // input: <blank> or om or 0 or 1 or 2 or 3 

class W1 {

     public static void main (String[] args) {

      try {

         int i = Integer.parseInt(args[0]);

         int [] y = {12 ,24 ,56};

          System.out.println(y[i]);

          String x = "om";
          System.out.println(x.charAt(i));
      }
              catch(IndexOutOfBoundsException e) {         // error => parent class uppar nhe likh sakta , child class ka catch ma
              System.out.println(e);
              System.out.println("IOBE");
          }
          catch(StringIndexOutOfBoundsException e) {
             
              System.out.println(e);
              System.out.println("SIOBE");
          } catch(NumberFormatException e) {
               System.out.println(e);
              System.out.println("NFE");
          }
           
     }
}

//     W1.java:23: error: exception StringIndexOutOfBoundsException has already been caught
//           catch(StringIndexOutOfBoundsException e) {
//           ^
// 1 error