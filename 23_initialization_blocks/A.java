class A {

    // instance level anonymous code blocks....

         {
             System.out.println("HI");                      // steps ==> 1) sabsa phela static cheeza run ho jayangi...
                                                            // step 2) then, obj banaga 
                        //step 3) then constructor call hoga , aur phela super() run hoga., then chaining hogi aur instances members frame ma ayanga..
                                                                 // step 4) super call khtm hona ka baad anynomous blocks run hoga...
                                                                 // step 5) then khud ka code run hoga jo constructor ka andar ha..
         }
     

        public static void main(String[] args) {

              System.out.println("Hello");
       
  }

}

  // isma constructor nhe ha toh jab constructor nhe ha toh anynomous block kaisa run hoga..