package W3_Classes;

public class ex9 {
    public static void main(String[] args){
        ConnectionManager M = new ConnectionManager();

        for (int i=1; i <=25; i++){
        Connection.print(ConnectionManager.extractConnection());
 
        }
        
    }
}

class ConnectionManager{
    private static Connection[] connections = new Connection[20];
    private static int count = 0;
    ConnectionManager(){
        for (int i=0; i< connections.length; i++){
            connections[i] = new Connection();
        }
    }

    public static Connection extractConnection(){
        if (count < connections.length-1){
            count++;
            return connections[count];
        }
        else{
            return null;
        }
    }
}

class Connection{
    private int connr;
    private static int idd = 0;

    public Connection(){
        idd++;
        connr = idd;
        System.out.println(idd);
    }

    public static void print(Connection c){
        if (c != null){
        System.out.println(c.connr);
        }
        else{
            System.out.println("Null");
        }
    }



}