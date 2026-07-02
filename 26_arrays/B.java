class B {

    public static void main(String[] args){
        String[][] x = new String[][] {{"om","mukesh","gaurav"},{"dholu","bholu"}};

         System.out.println("~~~~~~~~~~~~~~~~~~~");

         for(int i =0 ; i<x.length;i++){
            for(int j =0;j<x[i].length;j++){
                System.out.println(x[i][j]);
            }
             System.out.println("~~~~~~~~~~~~");
         }
    }
}