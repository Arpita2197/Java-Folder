import java.io.File;

class D {


    public static void main (String[] args) {

        File file = new File("A.java");           // File class ka sara constructors parameterized ha.........

        boolean flag = file.isDirectory();            // yeah current directory ma check karaga it means 44_fileHandling folder ma

        System.out.println("A.java folder/directory exists :" + flag);
    
}

}
