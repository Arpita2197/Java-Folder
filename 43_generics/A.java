import java.util.ArrayList;
import java.util.HashSet;

class A {

    public static void main(String[] args) {

        ArrayList x = new ArrayList();

        x.add(23.5);
        x.add(15);
        x.add(true);
        x.add("om");
        x.add(new HashSet());


        System.out.println(x);

    }
}