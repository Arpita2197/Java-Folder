class X {
     
     static void playSound(Cat x)  {

         x.makeSound();        
     }

       static void playSound(Cow x)  {

         x.makeSound();        
     }

       static void playSound(Dog x)  {

         x.makeSound();        
     }

     public static void main(String[] args) {

         Cat a = new Cat();
           playSound(a);

           
         Cow b = new Cow();
           playSound(b);

           
         Dog c = new Dog();
           playSound(c);
     }
}