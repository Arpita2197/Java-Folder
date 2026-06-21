class G {

    public static void main(String[] args) {

        Vehicle a = new SportsCar();

    //     if(a instanceof Bus) {
    //         System.out.println("SportsCar IS-A Bus");
    //     }else {    
    //          System.out.println("SportsCar IS-NOT-A Bus");
    //     }
    // } 

     
    //     if(a instanceof Object) {
    //         System.out.println("SportsCar IS-A Object");
    //     }else {    
    //          System.out.println("SportsCar IS-NOT-A Object");
    //     }
    // } 

     
    //     if(a instanceof Vehicle) {
    //         System.out.println("SportsCar IS-A Vehicle");
    //     }else {    
    //          System.out.println("SportsCar IS-NOT-A Vehicle");
    //     }
    // } 

     
    //     if(a instanceof FourWheeler) {
    //         System.out.println("SportsCar IS-A FourWheele");
    //     }else {    
    //          System.out.println("SportsCar IS-NOT-A FourWheele");
    //     }
    // } 

     
    //     if(a instanceof Car) {
    //         System.out.println("SportsCar IS-A Car");
    //     }else {    
    //          System.out.println("SportsCar IS-NOT-A Car");
    //     }
    // } 

     
        if(a instanceof SportsCar) {
            System.out.println("SportsCar IS-A SportsCar");
        }else {    
             System.out.println("SportsCar IS-NOT-A SportsCar");
        }
    
   } 

}
