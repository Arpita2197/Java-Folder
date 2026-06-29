class M1 {
 
    {

        System.out.println(x);
                                // agar anynomous block ma call karna ha instance var ko toh hamesha uska uppar hee define karo..
    }

     int x = 12;

    public static void main(String[] args) {

        M1 a = new M1();
    }
}

// M1.java:5: error: illegal forward reference
//         System.out.println(x);
//                            ^
// 1 error