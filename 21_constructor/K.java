class AAA {

    AAA() {
        
        System.out.println("Namaste Ji");
    }
}

class K extends AAA {

    public static void main(String[] args) {

        System.out.println("---- main start");

        K t = new K();
        
        
        System.out.println("---- main end");
    }
}