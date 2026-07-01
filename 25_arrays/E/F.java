class F {

     public static void main(String[] args) {

           LivingBeing t = new dog();

         Animal [] a = {new Animal() , new dog() , new cat() , new cow() , new Bdog() , (Animal)t};


           for(Animal next : a)

            System.out.println(next);
     }
}