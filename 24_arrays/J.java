class J {

     public static void main(String[] args) {

         String[] x = new String[4];         // string = non-premetive...

          System.out.println(x[0]);    // null
          System.out.println(x[1]);    // null
          System.out.println(x[2]);    // null
          System.out.println(x[3]);    // null

             System.out.println("~~~~~~~~~~");

         x[0] = "arpita";
         x[1] = new String("mayank");
         x[2] = new String("ram");
         x[3] = new String("raj");

          System.out.println(x[0]);    
          System.out.println(x[1]);    
          System.out.println(x[2]);    
          System.out.println(x[3]);  

     }
}