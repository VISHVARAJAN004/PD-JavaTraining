import java.util.function.*;
public class SupplierSample {
    public static void main(String[] args){
        Supplier<Integer> s=()->(12);
        System.out.print(s.get());
    }
}
