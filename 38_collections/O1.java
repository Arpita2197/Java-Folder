class O1 {

     public static void main (String [] args) {

         Employee1 x = new Employee1("hitesh" , 23);
         Employee1 y = new Employee1 ("hitesh",22);
         Student z = new Student("hitesh" , 18);


          System.out.println(x.equals(y));     // true
         
         System.out.println(x.equals(z));      // false
           

     }
}