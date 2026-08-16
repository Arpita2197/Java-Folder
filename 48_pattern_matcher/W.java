                
  import java.util.regex.Pattern;
  import java.util.regex.Matcher;

  class W {

     public static void main(String[] args) {

     
         Pattern p = Pattern.compile("0[xX][a-fA-F0-9]{2,}");           
         Matcher m = p.matcher("_#0x25az9c ~^H0X9qy08 i2130xks321 ox230x57345Aj 0xAA2k 0xA2A");

          while(m.find()) {

             System.out.println(m.start() + " - " + m.end() + " - " + m.group());

          }
     }
  }  