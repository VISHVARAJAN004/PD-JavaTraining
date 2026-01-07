@FunctionalInterface
interface MyLambda{
    public void display();
}
public class LambdaExample{
    public static void main(String[] args) {
        MyLambda m=()->{
            System.out.print("Lambda Example");
        };
        m.display();
    }
}