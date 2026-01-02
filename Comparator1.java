import java.util.*;

class Students{
    int age;
    String name;

    Students(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
public class Comparator1 {

    public static void main(String[] args) {
        Comparator<Students> ageDesc = new Comparator<Students>() {
            public int compare(Students s1, Students s2) {
                if (s1.age>s2.age)
                    return -1;
                else
                    return 1;
            }
        };
        ArrayList<Students> al=new ArrayList<>();
        al.add(new Students(22,"Mark"));
        al.add(new Students(19,"Rich"));
        al.add(new Students(12,"Henry"));
        al.add(new Students(22,"John"));
        Collections.sort(al, ageDesc);
        for (Students s : al) {
            System.out.println("Name: " + s.name + ", Age: " + s.age);
        }
        //Second highest age
        int highestAge=al.get(0).age;
        Students secondHighest=null;
        for(Students s:al){
            if(s.age<highestAge){
                secondHighest=s;
                break;

            }
        }
        System.out.print(secondHighest.name);

    }
}