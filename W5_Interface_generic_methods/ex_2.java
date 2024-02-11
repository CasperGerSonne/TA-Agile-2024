package W5_Interface_generic_methods;

public class ex_2 {
    public static void main(String[] args){
       dog d = new dog(10);
       gen g = new gen();
       g.genM(d);
    }
}

interface animal{
    
    public void sound();

    public void shit();
}

class dog implements animal{
    private int age;

    public dog(int age){
        this.age = age;
    }

    public void sound(){
        System.out.println("woof");
    }

    public void shit(){
        System.out.println("I made dogshit");
    }

    public void age(){
        this.age +=1;
        System.out.println(this.age);
    }
}



class gen{

    public <T extends animal> void genM(T ani){
        ani.sound();
        ani.shit();
    }
}
