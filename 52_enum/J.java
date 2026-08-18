enum Days {

     SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

class J {

    public static void main(String[] args) {

         Days d = Days.FRIDAY;  // value initialize kar raha hai.... aur toString() ko overridee kiya hai...

         System.out.println(d);
    }
}