import java.io.Console;

class L {

     public static void main(String[] args) {

         String y[] = new String[4];

          for(int i=0;i<y.length;i++) {

               System.out.println(y[i]);
          } 


           Console x = System.console();

            System.out.println("enter 4 strings...");

             for(int i=0 ; i<y.length;i++) {

                 y[i] = x.readLine();
             }

               System.out.println("----------");

            for(int i=0;i<y.length;i++) {

                 System.out.println(y[i]);
            }
     }
}

// import java.util.Scanner;

// class L {

//     public static void main(String[] args) {

//         String[] arr = new String[4];

//          Scanner sc = new Scanner(System.in);
          
//           System.out.println("enter 4 strings");

//            for(int i=0;i<arr.length;i++) {
//                 arr[i] = sc.nextLine();
//            }

//             for(int i=0;i<arr.length;i++) {
                
//                 System.out.println(arr[i]);
//             }
//     }
// }