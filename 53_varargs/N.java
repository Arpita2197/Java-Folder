class N {

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

            LivingBeing z = new Cat();


           pro(a,b,d,e,z);
      }
}

//  N.java:22: error: method pro in class N cannot be applied to given types;
//            pro(a,b,d,e,z);
//            ^
//   required: Animal[]
//   found:    Cat,Cow,Dog,BDog,LivingBeing
//   reason: varargs mismatch; LivingBeing cannot be converted to Animal
// 1 error
