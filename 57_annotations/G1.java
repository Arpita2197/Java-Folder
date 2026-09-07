import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Inherited;
import java.lang.annotation.RetentionPolicy;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface A {

}

@A
class X {


}

class G1 extends X {                               // Annotations inherit ho skata ha child class ma by meta annotations ==> inherited..

    public static void main(String[] args) {

         Class klass = G1.class;

         Annotation[] arr = klass.getAnnotations();

          for(Annotation nx : arr) {

             System.out.println(nx);
          } 
    }
}