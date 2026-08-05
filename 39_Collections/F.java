import java.util.HashMap;

class F {

    public static void main(String[] args) {
        HashMap x = new HashMap();

        System.out.println(x);
        
        x.put("Mohan", 78.89);
        x.put("Rohan", 88.12);
        x.put("Sohan", 63.54);
        x.put("Ganesh", 99.99);
        x.put("Mangesh", 82.59);
        
        System.out.println(x);
    }
}

// o/p == {}
// {Mohan=78.89, Ganesh=99.99, Mangesh=82.59, Sohan=63.54, Rohan=88.12}