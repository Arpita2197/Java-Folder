import java.util.ArrayList;

class D2 {

    public static void main(String[] args) {

        ArrayList <Integer>  x = new ArrayList <Integer>  (); // type-safety karna sa ham TYpe casting karna sa bach jayata ha

        x.add(23);
        x.add(15);
        x.add(29);
        x.add(30);

        System.out.println(x);

        Integer y = x.get(0);

       
    }

}