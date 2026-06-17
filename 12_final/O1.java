class O1 {
 
  void pro() {

     int e;  // i=unitiliazed       // error = agar local variable ho toh usma agar explicit value nhe do
                                    //  toh usma koi implicit value assign nhe hoti ha isliya error aa rhe ha
         
       int w=11;


        System.out.prinnt(e);
        
         System.out.prinnt(w);

  }

      public static void main(String[] args) {

          O1 a = new O1();

           a.pro();
      }
     
}

  
// O1.java:: error: variable e might not have been initialized
//         System.out.println(e);
//                            ^
// 1 error