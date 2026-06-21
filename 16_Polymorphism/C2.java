interface EE {


}

class Z implements EE {


}

class C2 {

    public static void main(String[] args) {

        EE a = new Z(); // interface ma ham child class ka OBJECT rakh sakta hai....
    }
}