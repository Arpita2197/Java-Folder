import java.util.*;

class A5 {

    public static void main(String[] args) {
      
       // ArrayList <HashSet<TreeMap<String,Integer>>> a = new ArrayList<HashSet<TreeMap<String,Integer>>> ();

        TreeMap <String,Integer>  x = new TreeMap <> ();
        x.put("om",12);
        x.put("shayam",14);

         TreeMap <String,Integer>  y = new TreeMap <> ();
        y.put("sohan",1);
        y.put("mohan",2);

         TreeMap <String,Integer>  z = new TreeMap <> ();
        z.put("sita",22);
        z.put("geeta",24);

        //--- error generating code---

        //  TreeMap <Boolean,Double>  w = new TreeMap <> ();
        // w.put(true,12.2);
      

        HashSet<TreeMap<String,Integer>> u = new HashSet<TreeMap<String,Integer>> ();
        u.add(x);
        u.add(y);

       HashSet<TreeMap<String,Integer>> v = new HashSet<TreeMap<String,Integer>> ();
        v.add(z);

              //--- error generating code---

        // HashSet<TreeMap<Boolean,Double>> s = new HashSet<TreeMap<Boolean,Double>> ();
        // s.add(w);
        
        ArrayList <HashSet<TreeMap<String,Integer>>> a = new ArrayList<HashSet<TreeMap<String,Integer>>> ();

         a.add(u);
         a.add(v);
         a.add(s);

          System.out.println(a);


    }
}

//  A5.java:43: error: incompatible types: HashSet<TreeMap<Boolean,Double>> cannot be converted to HashSet<TreeMap<String,Integer>>
//          a.add(s);
//                ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error
