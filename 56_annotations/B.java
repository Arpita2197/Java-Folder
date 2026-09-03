class BB {

    void process() {

         System.out.println("HI");
    }
}

class B extends BB {
         
     @Override
    void pracess() {

        System.out.println("Helloooo");
    }

     public static void main(String[] args) {

         B x = new B();
          x.process();
     }
}

//  B.java:11: error: method does not override or implement a method from a supertype
//      @Override
//      ^
// 1 error

// @Override ko methods ko check karna ka liya use karta ha ki ham child class ma sahi sa method override kar raha ki nhe