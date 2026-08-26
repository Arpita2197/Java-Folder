 import java.lang.reflect.Field;

class J {

    public static void main(String[] args) {

        Class klass = Student.class;

        Field[] a = klass.getFields();   // apni class/interface and parentt class/interface ka public fields bss dega...

        for(Field field : a) {

             System.out.println(field.getName());
        }
    }
}