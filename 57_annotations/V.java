import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface UU {

    String name() default "yam";
    int age()   default 10000;
}

@UU 
class V {

    public static void main(String[] args) {

        Class<V> klass = V.class;

        UU ano = klass.getAnnotation(UU.class);

        System.out.println(ano.name());
        System.out.println(ano.age());


    }
}

