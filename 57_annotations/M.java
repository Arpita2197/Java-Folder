import  static java.lang.annotation.ElementType.*;
         // ElementType ek enum ha aur isma enum ka constatnts static hota ha,,,isliya hamna import ma static likha ha
import java.lang.annotation.Target;


@Target({TYPE,METHOD,FIELD,CONSTRUCTOR,LOCAL_VARIABLE})         
@interface aaa {


}

@aaa
class M {

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
    M() {


    }


}