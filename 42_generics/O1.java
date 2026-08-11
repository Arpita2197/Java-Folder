class O1 {

    public static void main(String[] args) {

        LivingBeing xyz = new BDog();

        Animal[] x = new Animal[4];

        x[0] = new Cat();
        x[1] = new Cow();
        x[2] = new Dog();
        x[3] = (BDog)xyz;

         for(Animal next : x) {

            System.out.println(next);
         }
 
    }
}