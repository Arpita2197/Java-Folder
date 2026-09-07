import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})          
@interface aaa {


}

@aaa
class L {

    @aaa
    class A { 

    }

    @aaa
    interface B {

    }

    @aaa
    enum C {


    }

    @aaa
    int y = 10;

    @aaa
    static int x = 12;

    @aaa
    void pro() {

    }

    @aaa
    static void info() {

        @aaa
        int z = 111;

    }

    @aaa
    L() {


    }


}

//  C:\Users\lenovo\OneDrive\Desktop\java\57_annotations>javac L.java
// L.java:48: error: annotation type not applicable to this kind of declaration
//     @aaa
//     ^
// L.java:43: error: annotation type not applicable to this kind of declaration
//         @aaa
//         ^
// 2 errors
