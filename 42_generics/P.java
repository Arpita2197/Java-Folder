import java.util.ArrayList;

class P {

    public static void main(String[] args) {

        LivingBeing xyz = new BDog();

        ArrayList <Animal> x = new ArrayList <Animal> ();

        x.add(new Cat());
        x.add(new Dog());
        x.add(new Cow());
        x.add(xyz); 
        x.add(new Animal());

        System.out.println(x);
    }
}

// P.java:14: error: incompatible types: LivingBeing cannot be converted to Animal
//         x.add(xyz);
//               ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error
