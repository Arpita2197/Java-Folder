class ZZ {

    void pro(int x , float y) {
        
        System.out.println("HYYYYYY");
    }
}

class R1 extends ZZ {
  
     void pro(int y, float x) {       // METHOD OVERRIDING.........

           System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
     }
     
     public static void main(String[] args) {

          R1 z = new R1();
           z.pro(2,15.0f);
     }
     
}