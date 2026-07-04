class I {

     public static void main(String[] args) {

         String name1 = new String("ajeet");
          String name2 = new String("ajeet");

          int ag1 = 32;
          int ag2 = 32;

          Employee a = new Employee(name1 , ag1);
            Employee b = new Employee(name2 , ag2);

              System.out.println(a == b);
             System.out.println(a.equals(b));
     }
}