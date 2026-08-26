class B1 {

      public static void main(String[] args) {


         try {

             Class a = Class.forName("User");  // hamna abhi user class ko compile nhe kiya ha toh uska dot class nhe bana hai...
                                               // yeah pa user as a String pass hua ha na kio as Class
         } 
         
          catch (ClassNotFoundException e) {

               e.printStackTrace();
          }
      
    }
}

//  C:\Users\lenovo\OneDrive\Desktop\java\54_reflection>java B1
// java.lang.ClassNotFoundException: user
//         at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
//         at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
//         at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520)
//         at java.base/java.lang.Class.forName0(Native Method)
//         at java.base/java.lang.Class.forName(Class.java:375)
//         at B1.main(B1.java:8)
