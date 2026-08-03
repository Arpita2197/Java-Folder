class P {

     public static void main (String [] args) {

         Employee1 x = new Employee1("hitesh" , 2);
         Employee1 y = new Employee1 ("hitesh",22);
         Employee1 z  = new Employee1("hitesh" , 22);

         // it is reflexive :
           //   System.out.println(x.equals(x));             
           //   System.out.println(y.equals(y));  
          //   System.out.println(z.equals(z));  

         // it is symmetric :
           //    System.out.println(x.equals(y));
           //     System.out.println(y.equals(x));              

            // it is transistive : 
            //  System.out.println(x.equals(y));  
            //   System.out.println(y.equals(z));    
            //    System.out.println(x.equals(z));     

       // it is consistent : 
      
        //  System.out.println(x.equals(y));         
        //  System.out.println(x.equals(y));         
        //  System.out.println(x.equals(y));  

           // Null test : 

           
         System.out.println(x.equals(null));        
         System.out.println(y.equals(null));          
         System.out.println(z.equals(null));    
            

     }
}