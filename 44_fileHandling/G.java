import java.io.File;

class G {


    public static void main (String[] args) {

        File file = new File("C:/Users/lenovo/OneDrive/Desktop/44_fileHandling/xyx.java");           
        boolean flag = file.exists();        

        System.out.println("C:/Users/lenovo/OneDrive/Desktop/44_fileHandling/xyx.java:" + flag);
    
}

}