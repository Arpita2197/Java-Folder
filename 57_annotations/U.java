import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface WW {

    int x();
    String y();
}

@WW 
class U {

    public static void main(String[] args) {

        Class<U> klass = U.class;

       // Annotation ano = klass.getAnnotation(JJ.class);

        WW ano = klass.getAnnotation(WW.class);

       System.out.println(ano instanceof Object);
        
        System.out.println(ano.x());
        System.out.println(ano.y());


             
    }
}

//  U.java:12: error: annotation @WW is missing default values for elements x,y
// @WW
// ^
// 1 error