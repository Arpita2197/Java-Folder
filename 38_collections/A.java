import java.util.LinkedList;

class A {

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

          System.out.println(x.remove(0));
          System.out.println(x.remove(0));
          System.out.println(x.remove(0));
          System.out.println(x.remove(0));
          System.out.println(x.remove(0));      

        
         
          System.out.println(x);

 

    }
}

