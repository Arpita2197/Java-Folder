class N1 {

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

            LivingBeing z = new Cat();  // polymorphically aap cat ko LivingBeing ma assign kar sakta ho....


           pro(a,b,d,e,(Animal)z);
      }
}
