import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class W {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
    
        BB a = new BB();
        a.name = "om";

        BB b = new BB();
        b.name = "ranu";
        
        Class klass = AA.class;

        Method[] arr = klass.getDeclaredMethods();

        arr[0].invoke(a);

    }  
}    


//  Exception in thread "main" java.lang.IllegalArgumentException: object is not an instance of declaring class
//         at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
//         at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
//         at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
//         at java.base/java.lang.reflect.Method.invoke(Method.java:568)
//         at W.main(W.java:18)