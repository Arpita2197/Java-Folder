class L {

    void pro() {

        enum Days {       // method pro ka local hua....enum

     SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY

       }

        Days d = Days.TUESDAY;

        System.out.println(d);
    }

    public static void main(String[] args) {

        L a = new L();

        a.pro();

         
    }
}