class F {

     public static void main(String[] args) {

         F a = new F();                            

         System.out.println(F.w);
     }
}

class F1 {

     int w=2;
}


  // error =// F.java:7: error: cannot find symbol
                                                    //  System.out.println(F.w);
                                                       //                    ^
                                                    //  symbol:   variable w
                                                    // location: class F