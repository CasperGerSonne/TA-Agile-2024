package W5_Interface_generic_methods;

public class ex_3 {
    
    public static void main(String[] args) {
        myclass1 o = new myclass1();
        o.m1();
        o.m2();
    }
}

interface int1{
    public void m1();

}

interface int2{
    public void m2();
}

class myclass1 implements int1,int2{
    public void m1(){
        System.out.println("m1");
    }
    public void m2(){
        System.out.println("m2");
    }
}

