class M {

    int x = 10;

    {

        System.out.println(x);  // instance anynomous block ma instance var ko direct call kar satka ha

    }

    public static void main(String[] args) {

        M a = new M();
    }
}