import java.util.ArrayList;

class E {

    public static void main(String[] args) {
      
                                                        // super for super-classes useage....   
        pro(new ArrayList<Dog>());        
        pro(new ArrayList<Animal>());
        pro(new ArrayList<LivingBeing>());
        pro(new ArrayList<Object>());
            
       //-----------------------------------------
        info(new ArrayList<Dog>());          // extends for sub-classesss useage...  
        info(new ArrayList<BDog>());
        info(new ArrayList<HDog>());
        info(new ArrayList<GRDog>());

    } 
        
        static void pro(ArrayList<? super Dog> x) {

            System.out.println(x);
        }
        
        static void info(ArrayList <? extends Dog> y) {

            System.out.println(y);

            
        
        
          
    }
}