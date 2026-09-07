import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface A {

}

@A
class X {


}

class G extends X {                               // Annotations inherit nhe hota child class ma

    public static void main(String[] args) {

         Class klass = G.class;

         Annotation[] arr = klass.getAnnotations();

          for(Annotation nx : arr) {

             System.out.println(nx);
          } 
    }
}