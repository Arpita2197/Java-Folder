interface A {

     int a=15;

}


class L implements A {

     public static void main(String[] args ) {

         System.out.println(A.a);           // variable a is implicitly static ...
     }
}

