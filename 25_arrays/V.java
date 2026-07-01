class V {
    public static void main(String[] args){
        String[][] x = new String[2][];

        x[0] = new String[4];
        x[1] = new String[3];

        x[0][0] ="om";
        x[0][1] ="raj";
        x[0][2] ="kaliya";
        x[0][3] ="gori";

        x[1][0] ="ranu";
        x[1][1] ="rajaaa";
        x[1][2] ="bablu";

        System.out.println(x[0][0]);
        System.out.println(x[0][1]);
        System.out.println(x[0][2]);
        System.out.println(x[0][3]);
        System.out.println("~~~~~~~~~~~");
        System.out.println(x[1][0]);
        System.out.println(x[1][1]);
        System.out.println(x[1][2]);
    }
}