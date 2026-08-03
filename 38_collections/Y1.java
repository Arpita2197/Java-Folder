class Y1 {

     public static void main (String[] args) {

          String a = "mohan";
          String b = "mohan";
          String c = "sohan";

          System.out.println(a.compareTo(b));   // 0    //  java.lang ==>  Interface Comparable<T> ==>  compareTo(T o)
          System.out.println(a.compareTo(c));   // -6     // jo alphabet ma baad ma ayata ha woh bada hota ha 
          System.out.println(c.compareTo(a));   // 6
      }
}