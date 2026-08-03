class Y {

     public static void main (String[] args) {

          Integer a = 78;
          Integer b = 78;
          Integer c = 69;

          System.out.println(a.compareTo(b));   //0       //  java.lang ==>  Interface Comparable<T> ==>  compareTo(T o)
          System.out.println(a.compareTo(c));   // 1      
          System.out.println(c.compareTo(a));   // -1
      }
}


 // Treeset ek ordered and sorted class ha toh isma ham equals() yeah hashCode() ka basis ma nhe karta isma hamko compare karna hota ha kyuki yeah sorted hai