class M {

     final int q =888;

      public static void main(String[] args) {

          M x = new M();

           System.out.println(x.q);

            x.q=54;            //error = final keyword ko prinnt bss kar sakta ,, modified nhe...
      }
}

//           C:\Users\lenovo\Desktop\java\12_final>javac M.java
// M.java:11: error: cannot assign a value to final variable q
//             x.q=54;
//              ^
// 1 error