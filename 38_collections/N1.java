import java.util.HashSet;

class N1 {

  public static void main(String[] args) {

     HashSet <Student1> x = new HashSet <Student1> ();

       x.add(new Student1("om" , 18));
       x.add(new Student1("ram" , 11));
       x.add(new Student1("om" , 18));
       x.add(new Student1("ritik" , 22));
       x.add(new Student1("om" , 18));

        System.out.println(x);         // here in duplicate records ref . var are different so they treated as differ records

    
  }

}