import java.lang.reflect.Modifier;

class I {

    public static void main(String[] args) {

         Class klass = Employee3.class;

         int modifier = klass.getModifiers();

         String a = Modifier.toString(modifier);

         Class b = klass.getSuperclass();

          System.out.println(a);
          System.out.println(klass.getName());
          System.out.println(b.getName());

           Class[] c = klass.getInterfaces();

            for ( Class next : c) {

                 System.out.println(next.getName());
            }
    }
}