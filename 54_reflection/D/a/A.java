package a;

class A {

    public static void main(String[] args)  throws ClassNotFoundException {

     //  Class a = Class.forName("B");  // kahi pa code ma B class nhe ha iska matlab woh compile nhe hogi aur hamara pass compile B class bhi nhe ha
                      // yeah pa B class as a String hai.....    
    
        
         Class a = Class.forName("b.x.y.B"); //yeah import ki jarurt nhe ha kyuki forName ka andar package daal diya ha B class ka..
                                              // hamna B class compile kar di hai...

         System.out.println(a);
    } 
}