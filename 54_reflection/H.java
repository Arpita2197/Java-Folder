import java.lang.reflect.Modifier;

class H {

    public static void main(String[] args) {

         Class klass = Employee2.class;

          int modifier = klass.getModifiers();

          String a = Modifier.toString(modifier);

           System.out.println(a);
           System.out.println(klass.getName());
       
           Class kl = klass.getSuperclass();

            System.out.println(kl.getName());

           

         
    }
}