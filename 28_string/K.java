class K {
    
    public static void main(String[] args) {
        String x = "mohan99is4a567good89boy";

         String[] y = x.split("\\d\\d");          //        \\d ==> for 2 digits
            
               for(String next : y) {

             System.out.println(next);
         }
          
    }
}
