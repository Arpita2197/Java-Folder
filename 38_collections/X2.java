import java.util.TreeSet;

class X2 {

     public static void main(String[] args) {

         TreeSet <User> x = new TreeSet <User> ();

          x.add(new User("om" , 18));
          x.add(new User("golu" , 11));
          x.add(new User("vidit" , 20));
          x.add(new User("kalu" , 56));
          x.add(new User("siraj" , 55));

           System.out.println(x);
     }
}

//  Exception in thread "main" java.lang.ClassCastException: class User cannot be cast to class java.lang.Comparable (User is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//         at java.base/java.util.TreeMap.compare(TreeMap.java:1569)
//         at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
//         at java.base/java.util.TreeMap.put(TreeMap.java:785)
//         at java.base/java.util.TreeMap.put(TreeMap.java:534)
//         at java.base/java.util.TreeSet.add(TreeSet.java:255)
//         at X2.main(X2.java:9)