class N1 {
 
  static  {

        System.out.println(x);
                                // agar anynomous block ma call karna ha static var ko toh hamesha uska uppar hee define karo..
    }

   static  int x = 12;

    public static void main(String[] args) {

        N1 a = new N1();
    }
}


 
// C:\Users\lenovo\OneDrive\Desktop\java\23_initialization_blocks>javac N1.java
// N1.java:5: error: illegal forward reference
//         System.out.println(x);
//                            ^
// 1 error