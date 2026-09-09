import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface VV {

    int x();
    String y();
}

@VV (x=29,y="golu") 
class T {

    public static void main(String[] args) {

        Class<T> klass = T.class;

       // Annotation ano = klass.getAnnotation(JJ.class);

        VV ano = klass.getAnnotation(VV.class);

       System.out.println(ano instanceof Object);
        
        System.out.println(ano.x());
        System.out.println(ano.y());


          
    }
}
