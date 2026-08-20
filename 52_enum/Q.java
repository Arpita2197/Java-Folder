enum CoffeeMugSize {

        SMALL(200),MEDIUM(500),LARGE(700);

        private int size ;

        CoffeeMugSize(int size) {          // size ko initalize karna ka liya use kiya

             this.size = size;
        }

         public int getsize() {

             return size;
         }
}


class Q {

    public static void main(String[] args) {

         CoffeeMugSize x = CoffeeMugSize.SMALL;

         System.out.println(x);
         System.out.println(x.getsize());
    }
}

 // CoffeeMUgSize ek enum ha , toh uska ham OBJECT nhe bana sakta..
 // lekin CoffeeMugSize ek datatype ha aur SMALL/MEDIUM,LARGE ka objects ha toh ham constructor ka through usma size initalize kar denga....
 // constructors value initalize karna ka liya use hota hai............
 // this.size=size; ( current object ka size bata dega)...
 // int getsize() ma return size hai toh current obj ka size return kar dega.....