import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface A {

}

@Retention(RetentionPolicy.RUNTIME)
@interface B {

}

@Retention(RetentionPolicy.RUNTIME)
@interface C {


}

@A 
@B 
@C 
class X1 {

}

class D  {

    public static void main(String[] args) {

        Class klass = X1.class;

         Annotation[] arr = klass.getAnnotations();

         for(Annotation next : arr) {

             System.out.println(next);
         }
    }
}



