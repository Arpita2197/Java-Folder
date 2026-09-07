@interface UVW {


}

@UVW                      // ham apna banaya hua annotation kha-kha mark kar sakta hai...
class H {

     @UVW
     int y = 9 ;

     @UVW
     static int x = 10;

     @UVW
     void pro() {

     }

     @UVW
     static void info() {

        @UVW
        int w = 8;

     }

     @UVW
     H() {

     }
}