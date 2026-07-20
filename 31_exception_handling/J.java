 
 // command line argument = 45 or om or <blank>
 
 class J {

     public static void main(String[] args) {

          System.out.println("Start");

           try {

                int val = Integer.parseInt(args[0]); 

           } catch (ArrayIndexOutOfBoundsException e) {
               
             System.out.println(e);
               
           }

             System.out.println("End");
     }
     

}

 // for input = om
// Start
// Exception in thread "main" java.lang.NumberFormatException: For input string: "om"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:668)
//         at java.base/java.lang.Integer.parseInt(Integer.java:786)
//         at J.main(J.java:12)