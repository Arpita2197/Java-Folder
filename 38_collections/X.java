import java.util.TreeSet;

class X {

     public static void main(String[] args) {

         TreeSet <Student> x = new TreeSet <Student> ();

          x.add(new Student("om" , 18));
          x.add(new Student("golu" , 11));
          x.add(new Student("vidit" , 20));
          x.add(new Student("kalu" , 56));
          x.add(new Student("siraj" , 55));

           System.out.println(x);
     }
}

//  Exception in thread "main" java.lang.ClassCastException: class Student cannot be cast to class java.lang.Comparable (Student is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//         at java.base/java.util.TreeMap.compare(TreeMap.java:1569)
//         at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
//         at java.base/java.util.TreeMap.put(TreeMap.java:785)
//         at java.base/java.util.TreeMap.put(TreeMap.java:534)
//         at java.base/java.util.TreeSet.add(TreeSet.java:255)
//         at X.main(X.java:9)
