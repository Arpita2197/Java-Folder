import java.util.ArrayList;
import java.util.Date;

class E {

    
    public static void main(String[] args) {

        Integer a = new Integer(15);

        ArrayList x = new ArrayList();

        x.add(29);

        Date dt = new Date(2005,3,29);
    }
}

//  E.java:8: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer a = new Integer(15);
//                     ^
// Note: E.java uses or overrides a deprecated API.
// Note: Recompile with -Xlint:deprecation for details.
// Note: E.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 warning