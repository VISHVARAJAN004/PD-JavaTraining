import java.util.*;

    public class Primenumbers  {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            boolean flag=true;
            if(num ==0 || num==1){
                flag=false;
            }


            for(int i = 2; i <= num/2; i++) {
                if(num%i==0){
                    flag=false;
                    break;
                }
            }
            if (flag) System.out.print("Prime number");
            else System.out.print("Not a prime");
        }
    }

