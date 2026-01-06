import java.util.*;
public class ArrayListSample{
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>(List.of(30,40,50,60,70,80,90));
        al1.add(20);
        al1.addAll(al2);
        al1.add(0, 10);
        al1.forEach(n -> System.out.println(n));
    }
}
