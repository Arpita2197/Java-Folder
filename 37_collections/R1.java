import java.util.ArrayList;

class R1 {

     public static void main(String[] args) {
         
         
         ArrayList <Integer> x = new ArrayList <Integer>();

        x.add(10);  
        x.add(15);
        x.add(100);
        x.add(104);

        
         System.out.println(x);
         
         x.add(5,101);          // next index 4 ha aur aap 5 ma add() kar raha isliya Exception

         System.out.println(x);
         
     }
}

//  [10, 15, 100, 104]
// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 5, Size: 4
//         at java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
//         at java.base/java.util.ArrayList.add(ArrayList.java:481)
//         at R1.main(R1.java:18)