package networking.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        try (
                ServerSocket serverSocket = new ServerSocket(9000);
                Socket client = serverSocket.accept();
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(client.getInputStream()));
                PrintWriter out = new PrintWriter(client.getOutputStream(), true);
                ) {
                System.out.println("Connected..");
                String line = "";
                while ((line = in.readLine()) != null) {
                    out.println("You said: "  + line);
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
