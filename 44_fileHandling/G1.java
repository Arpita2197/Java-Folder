import java.io.File;

class G1 {


    public static void main (String[] args) {
 
        File file = new File("C:\ Users\ lenovo\ OneDrive\ Desktop\ 44_fileHandling\ xyx.java");          // backward slash        
        boolean flag = file.exists();        

        System.out.println("C:\ Users \ lenovo\ OneDrive\ Desktop\ 44_fileHandling\ xyx.java :" + flag);
    
}

}


// G1.java:5: error: illegal escape character
//         File file = new File("E:\movie\mohan.txt");
//                                  ^
// G1.java:5: error: illegal escape character
//         File file = new File("E:\movie\mohan.txt");
//                                        ^
// 2 errors