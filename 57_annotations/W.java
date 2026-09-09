import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface UU {

    String name() default "yam";
    int age()   default 10000;
}

@UU (name = "indra")
class W {

    public static void main(String[] args) {

        Class<W> klass = W.class;

        UU ano = klass.getAnnotation(UU.class);

        System.out.println(ano.name());
        System.out.println(ano.age());


    }
}
