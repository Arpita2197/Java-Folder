class Y {

  private int u = 15;

}

class E {

     public static void main(String[] args) {

         Y a = new Y();

          System.out.println(a.u);
     }
}

//  E.java:13: error: u has private access in Y
//           System.out.println(a.u);
//                               ^
// 1 error