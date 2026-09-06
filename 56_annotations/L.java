
         //  @Target({CONSTRUCTOR,FIELD,LOCAL_VARIABLE,METHOD,PACKAGE,MODULE,PARAMETER,TYPE})
              //public @interface Deprecated

 

@Deprecated
class L1 {


}

class L extends L1 {

     public static void main(String[] args) {

         L1 x;
     }
}

//  C:\Users\lenovo\OneDrive\Desktop\java\56_annotations>javac L.java
// Note: L.java uses or overrides a deprecated API.
// Note: Recompile with -Xlint:deprecation for details.

 // @Deprecated ==> agar ek class , members , constructors deprecated ha aur usko aap dusari class ma use kar raha toh
 // warning generate hogi......