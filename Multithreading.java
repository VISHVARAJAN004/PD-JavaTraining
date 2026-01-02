class Buffer{
    int value;
    boolean flag=false;
    synchronized public void oddNumbers(int v){
        while(flag)
            try{wait();} catch(Exception e){}
        value=v;
        System.out.print("Odd number: "+v+" ");
        flag=true;
        notify();
    }
    synchronized public void evenNumbers(int val){
        while(!flag)
            try{wait();} catch(Exception e){}
        value=val;
        System.out.print("Even number: "+val+" ");
        flag=false;
        notify();
    }
}
class Odd extends Thread{
    Buffer bf;
    public Odd(Buffer bf){
        this.bf=bf;
    }
    public void run(){
        for(int i=1;i<=10;i++){
            if(i%2==1){
                bf.oddNumbers(i);
            }
        }
    }
}
class Even extends Thread{
    Buffer bf;
    public Even(Buffer bf){
        this.bf=bf;
    }
    public void run(){
        for(int i=1;i<=10;i++){
            if(i%2==0){
                bf.evenNumbers(i);
            }
        }
    }
}

public class Multithreading{
    public static void main(String[] args) {
        Buffer b=new Buffer();
        Odd o=new Odd(b);
        Even e=new Even(b);
        o.start();
        e.start();
    }
}