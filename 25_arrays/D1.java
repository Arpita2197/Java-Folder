class D1 {

  public static void main(String[] args) {

     char a ='A';
     byte b = 11;
     short c = 229;
     int d = 1000;
     long e = 555L;
     float f = 55.555f;
     double g = 29.0;


      int [] x = {a,b,c,d, (int)e, (int)f, (int)g};            // type casting = ki user risk la raha ha..


      for(int next : x)

       System.out.println(next);

  }
     
}