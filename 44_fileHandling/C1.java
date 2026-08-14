import java.io.File;

class C1 {


    public static void main (String[] args) {

        File x = new File("demo");           // File class ka sara constructors parameterized ha.........

        boolean flag = x.exists();             // yeah current directory ma check karaga it means 44_fileHandling folder ma

        System.out.println("demo folder exists :" + flag);
    
}

}
