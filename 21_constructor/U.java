class Shape {

    int l;
    int w;
    int h;

    Shape(int l){
        this.l = l;
    }

    Shape(int l , int w) {

        this.l=l;
        this.w=w;
    }

    Shape(int l , int w , int h) {
         this(l,w);
         this.h=h;
    }
}

class U {

     public static void main(String[] args) {

         Shape x = new Shape(5);

          Shape y = new Shape(10,11);

          Shape z = new Shape(11,12,13);
     }
}