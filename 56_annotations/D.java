class DD {

     void process(int y , String x , float z) {

        System.out.println("HIIIIIIIII");

     } 
}


class D extends DD {

       @Override
       void process(int y , float x , String z) {

        System.out.println("HELLOOOOOOOO");

     } 

    public static void main(String[] args) {
          
          D x = new D();
          x.process(15,"mohan",15.29f);
     
    }
}

//  D.java:13: error: method does not override or implement a method from a supertype
//        @Override
//        ^
// 1 error