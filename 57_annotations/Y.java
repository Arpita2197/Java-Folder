import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface UU {

     String[]  record();
}

@UU (record = {"om","ram","raj"})
class Y {

    public static void main(String[] args) {

        Class<Y> klass = Y.class;

        UU ano = klass.getAnnotation(UU.class);

      //  System.out.println(ano.value());

       String[] arr = ano.record();

       for( String next : arr)
        System.out.println(next);
   


    }
}