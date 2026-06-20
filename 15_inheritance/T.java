class X {

}

class Y extends X {


}

class T extends Y {

    public static void main(String[] args) {

         T a = new T();
          
          
          System.out.println( a instanceof T);             // True 
          System.out.println( a instanceof Y); 
          System.out.println( a instanceof X);           
          System.out.println( a instanceof Object); 

          
          System.out.println("!!!!!!!!!!"); 


          System.out.println( a instanceof U); /// false
    }
}


class U extends T {


}