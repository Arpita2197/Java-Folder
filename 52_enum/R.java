enum CoffeeMugSize {

        SMALL(200),MEDIUM(500),LARGE(700);

        private int size ;

        CoffeeMugSize(int size) {          // size ko initalize karna ka liya use kiya

             this.size = size;
        }

         public int getsize() {

             return size;
         }

        //   public String toString() {

        //      return this + " - " + size;
        //   }

         public String Stringfy() {

              return this + " - " + size;
         }
}


class R {

    public static void main(String[] args) {

         CoffeeMugSize x = CoffeeMugSize.SMALL;

         System.out.println(x);
         //System.out.println(x.toString());
         System.out.println(x.Stringfy());
         System.out.println(x.getsize());
    }
}