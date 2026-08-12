import java.util.ArrayList;

class Z {

    public static void main (String[] args) {

         ArrayList<Dog> x = new ArrayList<> ();
          ArrayList<Cat> y = new ArrayList<> ();
           ArrayList<Cow> z = new ArrayList<> ();
            ArrayList<BDog> w = new ArrayList<> ();
             ArrayList<Animal> t = new ArrayList<> ();

           pro(x);
           pro(y);
           pro(z);
           pro(w);
           pro(t);

    }

     static void pro(ArrayList< ? extends Animal> animal ) {      // extends means Animal ki sari sub-classes


     }
}