package a.b.c;

class C extends A {

 
      public static void main(String[] args){


           // C a = new C();   // ok

             A a = new A();       // parent ka bana sakta isma kyuki same package ma hai

            System.out.println(a.x);


      }
      
       
}