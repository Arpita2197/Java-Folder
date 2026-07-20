 
 // command line argument = 45 or om or <blank>
 
 class K {

     public static  void main(String[] args) {

          System.out.println("Start");

           try {

                int val = Integer.parseInt(args[0]); 

                                                      // catch - all ==> sarri dard ki ek medicine nhe ho sakti(not a reliable code)
           } catch (Exception e) {                   // catch - all      ,  sarri problems Exception ma aa jauyangi chaya koi bhi type ki ho...
               
             System.out.println(e);
               
           }

             System.out.println("End");
     }
     

}