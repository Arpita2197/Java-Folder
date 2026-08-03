import java.util.TreeSet;

class X1 {

     public static void main(String[] args) {

         TreeSet <Employee1> x = new TreeSet <Employee1> ();

          x.add(new Employee1("om" , 18));
          x.add(new Employee1("golu" , 11));
          x.add(new Employee1("vidit" , 20));
          x.add(new Employee1("kalu" , 56));
          x.add(new Employee1("siraj" , 55));

           System.out.println(x);
     }
}

//  Exception in thread "main" java.lang.ClassCastException: class Employee1 cannot be cast to class java.lang.Comparable (Employee1 is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//         at java.base/java.util.TreeMap.compare(TreeMap.java:1569)
//         at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
//         at java.base/java.util.TreeMap.put(TreeMap.java:785)
//         at java.base/java.util.TreeMap.put(TreeMap.java:534)
//         at java.base/java.util.TreeSet.add(TreeSet.java:255)
//         at X1.main(X1.java:9)