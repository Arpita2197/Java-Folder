class E {

    public static void main(String[] args) {

         Class z = Employee.class;  // ab yeah Employee class phela sa compile nhe ha but Employee class ka as a name diya ha -
                                     // toh jab E.java compile hoga tab hee Employee class bhi compile ho jayaga....
        
         
         String a = z.getName();  // agar hamko bss class ka name bss chaiya ha toh getName() method ko call kar do....

          System.out.println(a);

    }
}