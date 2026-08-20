enum CoffeeMugSize {

        SMALL(200,"S"),MEDIUM(500,"M"),LARGE(700,"L");

        private int size ;
        private String label;

        CoffeeMugSize(int size , String label) {          // size ko initalize karna ka liya use kiya

             this.size = size;
             this.label = label;
        }

         public int getsize() {

             return size;
         }

           public String getlabel() {

             return label;
         }
}


class S {

    public static void main(String[] args) {

         CoffeeMugSize x = CoffeeMugSize.SMALL;

         System.out.println(x);
         System.out.println(x.getsize());
           System.out.println(x.getlabel());
    }
}
