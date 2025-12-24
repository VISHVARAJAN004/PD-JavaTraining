class Phone{
    public long phoneno;
    public String name;
    public String camera(){
        return "Camera is ready to use";
    }
    public String call(){
        return "You can call anyone";
    }
}
class SmartPhone extends Phone{
    @Override
    public String camera(){
        return "Smart Camera is ready to use";
    }

}
public class Inheritance{
    public static void main(String[] args) {
        SmartPhone sp=new SmartPhone();
        sp.phoneno=8870259378L;
        System.out.println(sp.phoneno);
        System.out.print(sp.camera());

    }
}