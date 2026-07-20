class H {

     public static void main(String[] args) {

         System.out.println("Start");

          Animal a = new Cat();

           try {

                 Dog  b = (Dog)a;
           }

            catch(ClassCastException v) {

                     System.out.println("problem"); 
            }

       

            System.out.println("end");
     }
}


class Animal { }

class Cat extends Animal{ }

class Dog extends Animal {  }

