class X2 {

    Animal pro() {

        return null;
    }
}

class I extends X2 {

     // NOT OKAY...
    //  LivingBeing pro() {
         
    //       return null;
    //  }

            // OKAY............

    //  Cat pro() {              // same and sub - types are allowed for methpod overriding...........

    //      return null;
    //  }

    //  Cow pro() {

    //      return null;
    //  }

    // Dog pro() {

    //      return null;
    //  }

    // BDog pro() {

    //      return null;
    //  }

     Animal pro() {

         return null;
     }
}