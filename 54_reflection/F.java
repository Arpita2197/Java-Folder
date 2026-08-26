class F {

    public static void main(String[] args) {

        Class a = Employee1.class;

         System.out.println(a.getModifiers());  // agar jiss Class ka .class nikal raha ha usma konsa modifiers laga ha woh find karna hai toh
                                                // getModifiers() ko call karo..
         System.out.println(a.getName());
    }
}

   // getModifiers() uss .class ka modifier number dega
   //   ab uss number ko convert karna ka liya
   // java.lang.reflect.Modifier package ka toString() call karo toh uss number ka string versiopn mil jayaga,,,,