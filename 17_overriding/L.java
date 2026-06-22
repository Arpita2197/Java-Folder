class X4 {                      

    public void pro() {
         
         System.out.println("pro( in parent)");
    }
}

class L extends X4 {
       
//private access control                    ^
//  attempting to assign weaker access privileges; was public
    //     private void pro() {
         
    //      System.out.println("pro( in child)");
    // }

      
    //      void pro() {
         
    //      System.out.println("pro( in child)");
    // }


    //    protected void pro() {
         
    //      System.out.println("pro( in child)");
    // }
  
          // OKAY..........
        
      public void pro() {
         
         System.out.println("pro( in child)");
    }

}