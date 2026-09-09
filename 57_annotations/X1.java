import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface UU {

     String[]  value();
}

@UU (value = {"omraj","ramraj","rajesh"})
class X1 {

    public static void main(String[] args) {

        Class<X1> klass = X1.class;

        UU ano = klass.getAnnotation(UU.class);

      //  System.out.println(ano.value());

       String[] arr = ano.value();

       for( String next : arr)
        System.out.println(next);
   


    }
}