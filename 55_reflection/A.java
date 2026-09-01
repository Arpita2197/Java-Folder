 import java.lang.reflect.Constructor;

class A {

     public static void main(String[] args) {

        Class klass = AA.class;

         Constructor[] arr = klass.getConstructors(); 

          for(Constructor next : arr) {

             System.out.println(next);
          }
     }
}

 // getConstructors() ==> bss khud ki class ka public constructors dega....