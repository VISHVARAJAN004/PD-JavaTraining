import java.io.*;
public class FileInput {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:/Users/v.iruthuvarnarajan/Idea Projects/Text.txt");
            byte b[] = new byte[fis.available()];
            fis.read(b);
            String str=new String(b);
            System.out.print(str);
        }
        catch(Exception e){
            System.out.print(e);
        }

    }
}