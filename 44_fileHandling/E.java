import java.io.File;

class E {


    public static void main (String[] args) {

        File file = new File("demo");           // File class ka sara constructors parameterized ha.........

        boolean flag = file.isDirectory();             // yeah current directory ma check karaga it means 44_fileHandling folder ma

        System.out.println("demo folder  exists :" + flag);
    
}

}
