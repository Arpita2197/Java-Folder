import java.io.File;

class D1 {


    public static void main (String[] args) {

        File file = new File("A.java");           // File class ka sara constructors parameterized ha.........

        boolean flag = file.isFile();             // yeah current directory ma check karaga it means 44_fileHandling folder ma

        System.out.println("A.java file exists :" + flag);
    
}

}
