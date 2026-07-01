class F1 {

     public static void main(String[] args) {

           LivingBeing t = new LivingBeing();

         Animal [] a = {new Animal() , new dog() , new cat() , new cow() , new Bdog() , (Animal) t};


           for(Animal next : a)

            System.out.println(next);
     }
}

//  Exception in thread "main" java.lang.ClassCastException: class LivingBeing cannot be cast to class Animal (LivingBeing and Animal are in unnamed module of loader 'app')
//         at F1.main(F1.java:7)
