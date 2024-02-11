package W3_Classes;

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Rodent m1 = new Mouse(4);
       
        m1.Bites();
        }
    }


class Rodent {
    private int numteeth;

    Rodent(int t){
        this.numteeth = t;
    }

    public void setteeth(int teeth){
        this.numteeth = teeth;
    }
    
    public int getteeth(){
        return this.numteeth;
    }


    public void Bite(){
        System.out.println("You have been bitten by a random rodent with " + this.numteeth + " teeth!");
    }

    public void Bites(){
 
        for (int i = 1; i <= this.numteeth;i++){
            Bite();
            
        }
    }
}

class Mouse extends Rodent{
    public Mouse(int t){
        super(t);
       
    }   
    public void Bite(){
        System.out.println("You have been bitten by a " + getClass().getSimpleName() + " with " + this.getteeth() + " teeth!");
    }
}
