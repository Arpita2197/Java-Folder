class C {

     int x = 99;

      void pro() {

         System.out.println("Hello!!!!!!!!!!");

      }

       class A {

         
       }

        public static void main(String[] args) {

            // System.out.println(x);

             pro();
        }
}

//  C:\Users\lenovo\OneDrive\Desktop\java\50_inner_classes>javac C.java
// C.java:20: error: non-static method pro() cannot be referenced from a static context
//              pro();
//              ^
// 1 error
