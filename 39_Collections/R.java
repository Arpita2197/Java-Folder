import java.util.Hashtable;

class R {

    public static void main(String[] args) {
        Hashtable <String , Double>  x = new Hashtable <String , Double> ();

        System.out.println(x);
        
        x.put("Mohan", 78.89);
        x.put("geet", 88.12);      // nul is not allowed as a key and a value
        x.put("Sohan", null);
        x.put("Ganesh", 99.99);
        x.put("Mangesh", 10.90);
        
        System.out.println(x);

         
    }
}

//  {}
// Exception in thread "main" java.lang.NullPointerException
//         at java.base/java.util.Hashtable.put(Hashtable.java:476)
//         at R.main(R.java:12)
