import java.lang.reflect.Field;
import java.util.Date;


class N {

    public static void main(String[] args) throws IllegalAccessException {

    Student2 x = new Student2("om",21,88.88f,new Date(889977));
     Student2 y = new Student2("ram",11,22.66f,new Date(000011));

     Class klass = Student2.class;

     Field[] arr = klass.getDeclaredFields();

        // System.out.println(arr[2].get(y));
        // System.out.println(arr[2].get(x));

         System.out.println(arr[0].get(y));
        System.out.println(arr[0].get(x));
       
       

       
    }
}

   // get(Object) sa apko Field[] ma kisi bhi field ki values chaiya ha toh mil jayagi....

 // 	get​(Object obj) ==> Returns the value of the field represented by this Field, on the specified object. 
     // throws ==> IllegalAccessException...