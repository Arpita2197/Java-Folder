import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface UU {

     String[]  values();
}

@UU (values = {"om","ram","raj"})
class X {

    public static void main(String[] args) {

        Class<X> klass = X.class;

        UU ano = klass.getAnnotation(UU.class);

      //  System.out.println(ano.value());

       String[] arr = ano.values();

       for( String next : arr)
        System.out.println(next);
   


    }
}