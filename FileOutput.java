import java.io.*;
public class FileOutput {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:/Users/v.iruthuvarnarajan/Idea Projects/Text.txt");
            String str="JAVA PROGRAM";
            try {
                fos.write(str.getBytes());
                fos.close();
            }
            catch(IOException e){
                System.out.print(e);
            }

        }
        catch(FileNotFoundException e){
            System.out.print(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}