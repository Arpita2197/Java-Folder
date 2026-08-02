import java.util.LinkedList;

class C {

    public static void main (String[] args) {
      
         // AS a Stack
        LinkedList <String> x = new LinkedList <String> ();

         x.push("mohan");
         x.push("sohan");
         x.push("rohan");
         x.push("gohan");
         x.push("tohan"); 


          System.out.println(x);

           
          System.out.println("~~~~~~~~~~~");

          System.out.println(x.pop());          // dynamically 
          System.out.println(x.pop());
          System.out.println(x.pop());
          System.out.println(x.pop());
          System.out.println(x.pop());      

              System.out.println(x);

    }
}