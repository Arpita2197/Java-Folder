class X5 {                      

    private void pro() {
         
         System.out.println("pro( in parent)");
    }
}

//NOT A METHOD OVERRIDING --------------------   kyuki private members dusari class ma accessible nhe ha..
class M extends X5 {
 
    // private void pro() {                       // iss ma class M , pro() ko apna hee method samjh raha hai..  na ki X5 ka
         
    //      System.out.println("pro( in child)");
    // }
     
      
    //     void pro() {                   
         
    //      System.out.println("pro( in child)");
    // }

    //  public void pro() {         
         
    //      System.out.println("pro( in child)");
    // }

      protected void pro() {         
         
         System.out.println("pro( in child)");
    }
     
}
