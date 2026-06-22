class X4 {                      // ACCESS CONTROLS..........

    protected void pro() {
         
         System.out.println("pro( in parent)");
    }
}

class K extends X4 {
       
//private access control                    ^
//   attempting to assign weaker access privileges; was protected
    //     private void pro() {
         
    //      System.out.println("pro( in child)");
    // }

           // default not ok...
    //      void pro() {
         
    //      System.out.println("pro( in child)");
    // }

     // OKAY................

    //    protected void pro() {
         
    //      System.out.println("pro( in child)");
    // }

      public void pro() {
         
         System.out.println("pro( in child)");
    }

}
