import java.io.File;

class F {


    public static void main (String[] args) {

        File file = new File("A.java");           

        String absolute_path = file.getAbsolutePath();        

        System.out.println("A.java absolute path :" + absolute_path);
    
}

}
