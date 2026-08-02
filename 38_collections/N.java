import java.util.HashSet;

class N {

  public static void main(String[] args) {

     HashSet <Integer> x = new HashSet <Integer> ();

       x.add(18);
       x.add(14);
       x.add(18);
       x.add(22);
       x.add(18);

        System.out.println(x);

    
  }

}

// o/p = 3 records (duplicates records are not allowed)