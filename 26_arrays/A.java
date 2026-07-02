import java.io.Console;

class A {
    public static void main(String[] args){
        Console cons = System.console();
          
          String[][] arr = new String[4][3];

           for(int i=0;i<arr.length;i++){
             for(int j=0;j<arr[i].length;j++){
                arr[i][j] = cons.readLine();
             }
           } 
           System.out.println("~~~~~~~~~");
            
            for(String[] next : arr){
                for(String nx : next){
                    System.out.println(nx);
                }
            }
    }
}