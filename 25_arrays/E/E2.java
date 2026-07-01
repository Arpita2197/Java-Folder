class E2 {

     public static void main(String[] args) {

         Animal [] a = new Animal[6];

          a[0] = new Animal();
          a[1] = new cat();
          a[2] = new cow();
          a[3] = new dog();
          a[4] = new Bdog();


           LivingBeing t = new dog();
            a[5] = (Animal)t;

           for(Animal next : a)

            System.out.println(next);
     }
}