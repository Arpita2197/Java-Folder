import java.util.HashMap;

class K {

    public static void main(String[] args) {
        HashMap <String , Double>  x = new HashMap <String , Double> ();

        System.out.println(x);
        
        x.put("Mohan", 78.89);
        x.put(null, 88.12);
        x.put("Sohan", null);
        x.put("Ganesh", 99.99);
        x.put("Mangesh", null);
        
        System.out.println(x);

         
    }
}

 // HashMap dupliacete records nhe rakhata 

 // but dupliacte value rakh sakta ha  lekin duplicate key nhe