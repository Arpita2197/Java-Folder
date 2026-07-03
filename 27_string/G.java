class G {

     public static void main(String[] args) {

         String x = new String("raju");
         String y = new String("raju");

            System.out.println(x==y);         // false == b/c 2 new objs so , 2 differe ref.var

            System.out.println(x .equals(y));       // true = b/c it checks only value
     }
}