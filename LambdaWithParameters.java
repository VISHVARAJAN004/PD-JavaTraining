@FunctionalInterface
interface Adder{
    public int add(int a,int b);
}

public class LambdaWithParameters {
    public static void main(String[] args) {
        Adder a = (x, y) -> {
            return x + y;
        };
        System.out.print(a.add(70, 30));
    }
}