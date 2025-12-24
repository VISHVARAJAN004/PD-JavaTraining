class Customer{
    private int itemNo;
    private String itemName;
    private double price;



    public int getItemNo(){
        return itemNo;
    }
    public String getItemName(){
        return itemName;
    }
    public double getPrice(){
        return price;
    }
    public void setItemNo(int itemNo){
        this.itemNo=itemNo;
    }
    public void setItemName(String itemName){
        this.itemName=itemName;
    }
    public void setPrice(double price){
        this.price=price;
    }
}

public class Encapsulation{
    public static void main(String[] args) {
        Customer c = new Customer();
        c.setItemNo(20);
        c.setItemName("Perfume");
        c.setPrice(55.5);
        System.out.println(c.getItemNo());
        System.out.println(c.getItemName());
        System.out.println(c.getPrice());
    }
}