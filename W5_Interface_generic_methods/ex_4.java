package W5_Interface_generic_methods;

import java.util.ArrayList;


public class ex_4 {
    Vendingmachine V = new Vendingmachine();
}

class Vendingmachine {
    private ArrayList<Product> productlist =  new ArrayList<Product>();
    private int balance = 0;

    public void addProduct(Product p){
        this.productlist.add(p);
    }
    public void removeProduct(Product p){
        this.productlist.remove(p);
    }
    public Product getProduct(int index){
        return this.productlist.get(index);
    }
   
    public void setbalance(int val){
        this.balance = val;
    }
    public int getbalance(){
        return this.balance;    
    }
    public void sell(Product p){
        if (this.balance >= p.getCost() && p.getAmount() > 0){
            this.balance -= p.getCost();
            System.out.println("Sold " + p.getName() + " for " + p.getCost());
            int change = 0;
            for (coins coin : coins.values()){
                while (this.balance >= coin.getAmount()){
                    this.balance -= coin.getAmount();
                    System.out.println("Gave " + coin.getAmount() + "kr");
                    change += coin.getAmount();
                }
            }
            System.out.println("Gave " + change + "kr in total");
        }
        else{
            System.out.println("Not enough money or not enough product");
        }
    }
    
}
enum Product{
    Cola("cola",10), Chips("chips",20), Nuts("nuts",30);

    private String name;
    private int cost;


    private Product(String name, int cost){
        this.name = name;
        this.cost = cost;

    }   

    public int getCost(){
        return this.cost;
    
        }
    public String getName(){
        return this.name;
    }

    public int getAmount(){
        return this.amount;
    }

    public void setAmount(int val){
        this.amount = val;
    }
    

}
enum coins{
    twenty(20),ten(10),Five(5),Two(2), One(1)  ;

    private int amount;

    coins(int amount){
        this.amount = amount;
    }

    public int getAmount(){
        return amount;
    }
}

class User{
  

    public static void enter_coin(coins coin,Vendingmachine Ven){
        
        Ven.setbalance(Ven.getbalance() + coin.getAmount());
        System.out.println("New ballance = " + Ven.getbalance());
    }

    public static void Choose_product(Vendingmachine Ven,Product p){
        Ven.sell(p);  
    }

    public static void refill_product(Product p){
        p.setAmount(10);
        System.out.println("Refilled " + p.getName() + " for " + p.getCost());
    }
}