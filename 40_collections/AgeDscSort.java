import java.util.Comparator;

class AgeDscSort implements Comparator<Employee> {

     public int compare(Employee a , Employee b) {

         return a.name.compareTo(b.name);
     }
}