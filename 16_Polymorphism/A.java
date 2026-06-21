class X1 { }

class X2 extends X1 { }

class X3 extends X2 { }

class A {

    public static void main(String[] args) {

         X3 z = new X3();     // child class

         // polymorphically assignment...

         X2 a = new X3();
         X1 b = new X3();
         Object c = new X3();

         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
    }
}