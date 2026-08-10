import java.util.ArrayList;

class F {

    public static void main(String[] args) {

        ArrayList <int> a = new ArrayList ();

        ArrayList <char> b = new ArrayList();



    }


}

// F.java:7: error: unexpected type
//         ArrayList <int> a = new ArrayList ();
//                    ^
//   required: reference
//   found:    int
// F.java:9: error: unexpected type
//         ArrayList <char> b = new ArrayList();
//                    ^
//   required: reference
//   found:    char
// Note: F.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 2 errors
