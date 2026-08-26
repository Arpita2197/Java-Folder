import java.lang.reflect.Method;

class P {

    public static void main(String[] args) {

        Class klass = Employee4.class;

         Method[] arr = klass.getDeclaredMethods();

          for ( Method  next : arr) {

             System.out.println(next.getName());

          }
    }
}

 // getDeclaredMethods() ==> khud ki class ki sari methods dega bsss , chaya koi bhi aceess modifier use kiya ho......