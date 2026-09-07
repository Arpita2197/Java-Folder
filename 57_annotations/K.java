import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target({ElementType.TYPE,ElementType.METHOD})          
@interface aaa {


}

@aaa
class K {

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
    K() {


    }


}

 
// C:\Users\lenovo\OneDrive\Desktop\java\57_annotations>javac K.java
// K.java:29: error: annotation type not applicable to this kind of declaration
//     @aaa
//     ^
// K.java:32: error: annotation type not applicable to this kind of declaration
//     @aaa
//     ^
// K.java:48: error: annotation type not applicable to this kind of declaration
//     @aaa
//     ^
// K.java:43: error: annotation type not applicable to this kind of declaration
//         @aaa
//         ^
// 4 errors
