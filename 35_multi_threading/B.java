class B {

     public static void main(String[] args) {

         Thread x = Thread.currentThread();

          System.out.println("Name :"+ x.getName());
          
          System.out.println( "Id :"+ x.getId());
          
          System.out.println(" Priority :"+ x.getPriority());
     }

}