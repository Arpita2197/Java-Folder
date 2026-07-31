import java.util.ArrayList;

class S {

     public static void main(String[] args) {

       ArrayList <Integer> x = new ArrayList <Integer>();

        x.add(10);  
        x.add(15);
        x.add(100);
        x.add(104);

        System.out.println(x);

        x.set(4,10001);  // replace waha hoga jaha index exists karta hogaa
        
        System.out.println(x);



     }
}

//  C:\Users\lenovo\Desktop\java\37_collections>java S
// [10, 15, 100, 104]
// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 4 out of bounds for length 4
//         at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
//         at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
//         at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
//         at java.base/java.util.Objects.checkIndex(Objects.java:359)
//         at java.base/java.util.ArrayList.set(ArrayList.java:441)
//         at S.main(S.java:16)
