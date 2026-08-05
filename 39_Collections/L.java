import java.util.HashMap;

class L {

     public static void main (String[] args) {

         HashMap <String , Double> x = new HashMap <String , Double> ();

          x.put("mohan", 89.00);
          x.put("sohan" , 78.89);

          System.out.println(x);

          x.put("mohan" , 56.00);

            System.out.println(x);
     }
}

// HashMap duplicate key store nhe karta but duplicate key ayati ha toh uski value update kar deta ha

// aur return ma old Value deta ha