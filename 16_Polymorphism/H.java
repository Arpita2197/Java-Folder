class H {

    public static void main(String[] args) {

         Car a = new SportsCar();

         
        if(a instanceof Bus) {
            System.out.println("SportsCar IS-A Bus");
        }else {    
             System.out.println("SportsCar IS-NOT-A Bus");
        }
    
     } 
   
  }

//    H.java:8: error: incompatible types: Car cannot be converted to Bus
//         if(a instanceof Bus) {
//            ^
// 1 error

