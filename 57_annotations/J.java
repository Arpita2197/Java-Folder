import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target(ElementType.TYPE)          // TYPE ==> class,interface,enum isma bss kar sakta hai..
@interface aaa {


}

@aaa
class J {

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
    J() {


    }


}

//  C:\Users\lenovo\OneDrive\Desktop\java\57_annotations>javac J.java
// J.java:29: error: annotation type not applicable to this kind of declaration
//     @aaa
//     ^
// J.java:32: error: annotation type not applicable to this kind of declaration
//     @aaa
//     ^
// J.java:35: error: annotation type not applicable to this kind of declaration
//     @aaa
//     ^
// J.java:40: error: annotation type not applicable to this kind of declaration
//     @aaa
//     ^
// J.java:48: error: annotation type not applicable to this kind of declaration
//     @aaa
//     ^
// J.java:43: error: annotation type not applicable to this kind of declaration
//         @aaa
//         ^
// 6 errors