import java.util.function.*;
public class PredicateSample {
    public static void main(String[] args){
        Predicate<Integer> isEven=num->num%2==0;
        Predicate<Integer> isGreater=num->num>50;
        System.out.print(isEven.and(isGreater).test(65));
    }
}