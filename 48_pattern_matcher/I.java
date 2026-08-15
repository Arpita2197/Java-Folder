import java.util.regex.Pattern;
import java.util.regex.Matcher;

class I {

    public static void main(String[] args) {

        Pattern p = Pattern.compile("ram");
        Matcher m = p.matcher("good boy ram is in class 12th and ram is my friend and ram sings well");

        while(m.find()) {

             System.out.println(m.find() + " - " + m.start() + " - " + m.end() + " - " + m.group());
              
        }
    }

}    