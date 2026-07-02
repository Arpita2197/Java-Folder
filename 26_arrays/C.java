class C {
    public static void main(String[] args){
        String[][] x = new String[][]{{"a","b","c"},{"f","g"},{"j","k","l","m"}};

         for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                System.out.println(x[i][j]);
            }

             System.out.println("~~~~~~~~~~~~~");

         }
    }
}