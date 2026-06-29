class N {

   static int x = 10;

  static  {

        System.out.println(x);  // static anynomous block ma static var ko direct call kar satka ha

    }

    public static void main(String[] args) {

        N a = new N();
    }
}