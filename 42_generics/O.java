class O {

    public static void main(String[] args) {

        LivingBeing xyz = new BDog();

        Animal[] x = new Animal[4];

        x[0] = new Cat();
        x[1] = new Cow();
        x[2] = new Dog();
        x[3] = xyz;

         for(Animal next : x) {

            System.out.println(next);
         }
 
    }
}

// O.java:12: error: incompatible types: LivingBeing cannot be converted to Animal
//         x[3] = xyz;
//                ^
// 1 error
