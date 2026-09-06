import java.util.ArrayList;

@Deprecated
class X1 {

   @Deprecated
   static int y ;
}

class X {

       @SuppressWarnings({"unchecked","deprecation"})
    

    public static void main(String[] args) {
   
        //  @SuppressWarnings("deprecation")
         X1 x;

         ArrayList a = new ArrayList();
       
         a.add(15);

          System.out.println(W1.y);


    }
}