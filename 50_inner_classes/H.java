class H {

     class A {

         
     }

      public static void main(String[] args) {
   
          A x = new H().new A(); // not a good way kyuki hamara pass H (outer class ) ka ref.code hold ma nhe ha isma , jiski baja sa ham isko
                                   // baad ma access nhe kar payanaga...  

           // or
            
           H a = new H();     // best way
           A y = a.new A(); 
      }
}