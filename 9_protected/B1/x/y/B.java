package x.y;
import a.b.c.A;

class B extends A {

     public static void main(String[] args) {

           B a = new B();       // ok

           // A y = new A();       // not okay....   dusara package ma toh apko child ka hee obj bananana padaga , na ki parent ka...          
                                           

            System.out.println(a.x);
     }
}

 