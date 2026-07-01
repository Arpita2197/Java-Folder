class S {
    public static void main(String[] args){
        String[][] arr = new String[3][2];

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);

        System.out.println("~~~~~~~~~~~~");

         arr[0][0]= "om";
         arr[0][1] = "ram";
         arr[1][0] = "golu";
         arr[1][1] = "sonu";
         arr[2][0] = "monu";
         arr[2][1] = "suresh";

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
    }
}