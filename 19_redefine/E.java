class Car {
 
    
}

class sportsCar extends Car {


}

class E {

     static void pro(Car car) {

         System.out.println("Car paratmerized method");
     }

      static  void pro(sportsCar scar) {

         System.out.println("sportsCar paratmerized method");

       }

          public static void main(String[] args) {

             Car z = new sportsCar();           // this is overloading..
              
              sportsCar a = new sportsCar();

              pro(z);
              pro(a);
          }
     
}