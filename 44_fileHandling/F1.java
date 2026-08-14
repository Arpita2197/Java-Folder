import java.io.File;

class F1 {


    public static void main (String[] args) {

        File file = new File("demo");           

        String absolute_path = file.getAbsolutePath();        

        System.out.println("demo absolute path :" + absolute_path);
    
}

}