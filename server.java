import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class server{
    public static void main(String[] args) {
        
        //server socket
        try {
            ServerSocket sc=new ServerSocket(5000);
            System.out.println("Server is listening at port 5000");
            Socket ss=sc.accept();

            //input and output stream
            BufferedReader in=new BufferedReader(new InputStreamReader(ss.getInputStream()));
            PrintWriter out=new PrintWriter(ss.getOutputStream(),true);

            //read client data
            String message= in.readLine();
            System.out.println("Client: " +message);

            //close the client socket
            ss.close();
        } catch (Exception e) {
            System.out.println("No connection");
        }

    }
}