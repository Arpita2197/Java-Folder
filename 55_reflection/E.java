class E {

     public static void main(String[] args) {

         Class klass = EE.class;

          Class[] arr = klass.getClasses();

          for(Class next : arr) {

             System.out.println(next.getName());
          }
     }
}

 // getClasses() ==> Returns:the array of Class objects representing the public members of this class