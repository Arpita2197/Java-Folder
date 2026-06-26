class Shape {

     int length;
     int width;
     int height;

     Shape(int length ) {

         this.length = length;
     }

      Shape(int length , int width ) {

         this.length = length;
         this.width = width;
     }

      Shape(int length , int width , int height ) {

         this.length = length;
         this.width = width;
         this.height = height;
     }
}

class S1 {

    public static void main(String[] args) {

         Shape a = new Shape(5);
         // a.length=5; 

          Shape b = new Shape(10,20);
         // b.length=5; 
         // b.width=10;

          Shape c = new Shape(2,3,4);
         // c.length=5; 
         // c.width=20;
         // c.height=30;
    }
}