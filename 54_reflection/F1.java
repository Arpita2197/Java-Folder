import java.lang.reflect.Modifier; 

class F1 {

    public static void main(String[] args) {

         Class x = Employee1.class;

          int a = x.getModifiers();        // 17
           
           System.out.println(a);                   
           System.out.println(Modifier.toString(a));       // public final
            System.out.println(x.getName());              // Employee1
    }
}