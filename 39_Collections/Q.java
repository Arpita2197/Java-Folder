import java.util.Hashtable;

class Q {

    public static void main(String[] args) {
        Hashtable <String , Double>  x = new Hashtable <String , Double> ();

        System.out.println(x);
        
        x.put("Mohan", 78.89);
        x.put(null, 88.12);      // nul is not allowed as a key and a value
        x.put("Sohan", 12.46);
        x.put("Ganesh", 99.99);
        x.put("Mangesh", 10.90);
        
        System.out.println(x);

         
    }
}

//   {}
// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null
//         at java.base/java.util.Hashtable.put(Hashtable.java:481)
//         at Q.main(Q.java:11)

