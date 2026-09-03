class CC {

     void process(int y , String x , float z) {

        System.out.println("HIIIIIIIII");

     } 
}


class C extends CC {

       void process(int y , float x , String z) {

        System.out.println("HELLOOOOOOOO");

     } 

    public static void main(String[] args) {
          
          C x = new C();
          x.process(15,"mohan",15.29f);
     
    }
}