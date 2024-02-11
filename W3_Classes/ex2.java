package W3_Classes;

public class ex2 {
    public static void main(String[] args) {
        Mouse m1 = new Mouse(4);
        Gebril G1 = new Gebril(10);
        Hamster H1 = new Hamster(1);
        
        Rodent[] rodents = {m1,G1,H1};

        for (int i = 0; i <= rodents.length; i++){
            rodents[i].Bite();
        }
    }
}

class Rodent {
    private int numteeth;
    private String type;

    Rodent(int t,String type){
        this.numteeth = t;
        this.type = type;
        System.out.println("Rodent");
    }

    public void setteeth(int teeth){
        this.numteeth = teeth;
    }
    public String gettype(){
        return this.type;
    }
    public int getteeth(){
        return this.numteeth;
    }

    public void Bite(){
        System.out.println("You have been bitten by a random rodent with " + this.numteeth + " teeth!");
    }
}

class Mouse extends Rodent{
    public Mouse(int t){
        super(t,"Mouse");
        System.out.println("Mouse");
    }
    
    public void Bite(){
        System.out.println("You have been bitten by a random " + this.gettype() + " with " + this.getteeth() + " teeth!");
    }
}

class Gebril extends Rodent{
    public Gebril(int t){
        super(t,"Gebril");
        System.out.println("Gebril");
    }
    
    public void Bite(){
        System.out.println("You have been bitten by a random " + this.gettype() + " with " + this.getteeth() + " teeth!");
    }
}

class Hamster extends Rodent{
    public Hamster(int t){
        super(t,"Hamster");
        System.out.println("Hamster");
    }
    
    public void Bite(){
        System.out.println("You have been bitten by a random " + this.gettype() + " with " + this.getteeth() + " teeth!");
    }
}