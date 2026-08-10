import java.util.ArrayList;

class B1 {

    public static void main(String[] args) {

        ArrayList x = new ArrayList();

        x.add(23);
        x.add(true);
        x.add("om");
        x.add(15.29);

        System.out.println(x);

       String str = (String)x.get(2);

          System.out.println(str);

    }

}
