interface Reference{
    public void display(String str);
}

public class MethodReference{
    public static void main(String[] args) {
        Reference r=System.out::println;
        r.display("Welcome");
    }
}