import java.util.ArrayList;

class D {

    public static void main(String[] args) {
      
                                                        // super for super-classes useage....   
        ArrayList<? super Dog> x = new ArrayList<Dog>();        
        ArrayList<? super Dog> y = new ArrayList<Animal>();
        ArrayList<? super Dog> z = new ArrayList<LivingBeing>();
        ArrayList<? super Dog> w = new ArrayList<Object>();
            
       //-----------------------------------------
        ArrayList<? extends Dog> a = new ArrayList<Dog>();          // extends for sub-classesss useage...  
        ArrayList<? extends Dog> b = new ArrayList<BDog>();
        ArrayList<? extends Dog> c = new ArrayList<HDog>();
        ArrayList<? extends Dog> d = new ArrayList<GRDog>();
        
        
        
        
        
    }
}