package W5_Interface_generic_methods;
public class ex_1{

}

class Holder{
    private int x;
    private int y;
    private int z;
    public Holder(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getZ(){
        return z;
    }

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setZ(int z){
        this.z = z;
    }

}