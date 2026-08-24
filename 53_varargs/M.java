class M {

    static void pro(Animal...x) {
         
        for(Animal nx : x) {

             System.out.println(nx);
        }
       
    }

      public static void main(String[] args) {

            Cat a = new Cat();
            Cow b = new Cow();
            Dog d = new Dog();
            BDog e = new BDog();

           pro(a,b,d,e);
      }
}