import java.io.File;

class B1 {


    public static void main (String[] args) {

        File file = new File("A1.java");           // File class ka sara constructors parameterized ha.........

        boolean flag = file.exists();             // yeah current directory ma check karaga it means 44_fileHandling folder ma

        System.out.println("abc.txt exists :" + flag);
    }
}




   // o/p == true