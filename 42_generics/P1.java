import java.util.ArrayList;

class P1 {

    public static void main(String[] args) {

        LivingBeing xyz = new BDog();

        ArrayList <Animal> x = new ArrayList <Animal> ();

        x.add(new Cat());
        x.add(new Dog());
        x.add(new Cow());
        x.add((BDog)xyz); 
        x.add(new Animal());

        System.out.println(x);
    }

}
