import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) {
        try {
            Socket cs = new Socket("localhost", 5000);
            BufferedReader ink=new BufferedReader(new InputStreamReader(System.in));
            BufferedReader ins=new BufferedReader(new InputStreamReader(cs.getInputStream()));
            PrintWriter out = new PrintWriter(cs.getOutputStream(), true);

            //keyboard flush
            String keyb=ink.readLine();

            //to server
            out.println("I am the client");
            out.println(keyb);

            //from server
            String response=ins.readLine();
            System.out.println("Server response: "+ response);

            cs.close();
        } catch (UnknownHostException e) {
            System.out.println("Unknown host: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO error: " + e.getMessage());
        }

    }
}
