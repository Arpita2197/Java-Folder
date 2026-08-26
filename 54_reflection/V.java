import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class V {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
    
        AA a = new AA();
        a.name = "yamraj";

        AA b = new AA();
        b.name = "indra";
        
        Class klass = AA.class;

        Method[] arr = klass.getDeclaredMethods();

        arr[0].invoke(a);

    }    
}

 // invoke(Object , Object...) ==> invoke() sa aap kitna bhi class ka instances bana ho , 
 // aap particular instance Object ko call kar sakta aur uski particular methods ki property  ko access kar sakta ho,jo uss method definition ma ha..
 // jaisa isma arr[0] ma name property ko acees kiya .
 // invoke ==> throws IllegalAccessException, InvocationTargetException
