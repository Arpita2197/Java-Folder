import java.lang.annotation.Annotation;

@interface JJ {

    int x();
    String y();
}

@JJ (x=29,y="golu") 
class S {

    public static void main(String[] args) {

        Class<S> klass = S.class;

       // Annotation ano = klass.getAnnotation(JJ.class);

        JJ ano = klass.getAnnotation(JJ.class);

       // System.out.println(ano instanceof Object);
        
        System.out.println(ano.x());
        System.out.println(ano.y());


                // kyuki hamna retentionpolicy use nhe ki..
    }
}

//  C:\Users\lenovo\OneDrive\Desktop\java\57_annotations>java S
// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "JJ.x()" because "<local2>" is null
//         at S.main(S.java:22)
