class X3 {                      // ACCESS CONTROLS..........

    void pro() {
         
         System.out.println("pro( in parent)");
    }
}

class J extends X3 {

// private access control/...
//   attempting to assign weaker access privileges; was package
    // private  void pro() {
         
    //      System.out.println("pro( in child)");
    // }

     // OKAY...... same or wider access controls are allowed........

    //    void pro() {
         
    //      System.out.println("pro( in child)");
    // } 

    //  protected void pro() {
         
    //      System.out.println("pro( in child)");
    // }

      public void pro() {
         
         System.out.println("pro( in child)");

    }

     public static void main(String[] args) {

          J x = new J();
           x.pro();
     }
}