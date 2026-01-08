import java.util.*;
import java.util.function.*;
public class ConsumerSample {
    public static void main(String[] args){
        Consumer<Integer> square= num->System.out.println(num*num);
        List<Integer> list=Arrays.asList(1,2,3,4,5,6);
        list.forEach(square);
    }
}
