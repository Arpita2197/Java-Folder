import java.util.LinkedList;

class A1 {

    public static void main (String[] args) {
      
         // AS a list
        LinkedList <String> x = new LinkedList <String> ();

         x.add("mohan");
         x.add("sohan");
         x.add("rohan");
         x.add("gohan");
         x.add("tohan"); 


          System.out.println(x.get(0));
          System.out.println(x.get(1));
          System.out.println(x.get(2));
          System.out.println(x.get(3));
          System.out.println(x.get(4));      

          System.out.println(x);

           
          System.out.println("~~~~~~~~~~~");

          System.out.println(x.remove(0));          // dynamically 
          System.out.println(x.remove(1));
          System.out.println(x.remove(2));
          System.out.println(x.remove(3));
          System.out.println(x.remove(4));      

        
         
          System.out.println(x);

 

    }
}

//  ~~~~~~~~~~~
// mohan
// rohan
// tohan
// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 3, Size: 2
//         at java.base/java.util.LinkedList.checkElementIndex(LinkedList.java:559)
//         at java.base/java.util.LinkedList.remove(LinkedList.java:529)
//         at A1.main(A1.java:31)

// C:\Users\lenovo\Desktop\java\38_collections>

