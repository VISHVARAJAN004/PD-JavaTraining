import java.util.*;
public class HashMapSample{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s=sc.next();
        HashMap<Character,Integer> freq=new HashMap<>();
        for(char c:s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        System.out.println(freq);
    }
}