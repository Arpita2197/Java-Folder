import java.io.File;

class C {


    public static void main (String[] args) {

        File file = new File("golu");           // File class ka sara constructors parameterized ha.........

        boolean flag = file.exists();             // yeah current directory ma check karaga it means 44_fileHandling folder ma

        System.out.println("golu exists :" + flag);
    
}

}
