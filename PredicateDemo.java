import java.util.*;
import java.util.function.*;

class Employee{
    public String name;
    public String company;
    public Employee(String name,String company){
        this.name=name;
        this.company=company;
    }
}
public class PredicateDemo{
    public static void main(String[] args) {
        Predicate<Employee> isEquals = e -> e.company.equals("Seeburger");
        List<Employee> list=new ArrayList<>();
        list.add(new Employee("Vishva","Seeburger"));
        list.add(new Employee("Sam","TCS"));
        list.stream().filter(isEquals).forEach(e->System.out.println(e.name));
    }
}
