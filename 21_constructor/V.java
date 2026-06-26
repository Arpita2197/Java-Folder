class YY {

     YY(int y) {

         System.out.println("HELLO");
     }


}

class V extends YY {

    public static void main(String[] args) {

         System.out.println("A");

         V x = new V();                           // super() yeah super call ho raha ha , aur super call constructor ko call karaga 
                                         // lekin YY ma constructor parameterized ha, aur ham super call ma koi value pass nhe kar raha ha,
                                    // isliya error aa rhe ha..

         System.out.println("B");
    }


}

//  V.java:11: error: constructor YY in class YY cannot be applied to given types;
// class V extends YY {
// ^
//   required: int
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// 1 error
