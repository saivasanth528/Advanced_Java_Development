package networking.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
    public static void main(String[] args) {

        try (
                Socket socket = new Socket("localhost", 9000);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
                ) {
            String userInput;
            while ((userInput = stdIn.readLine()) != null && !userInput.equals("")) {
                out.println(userInput);
                System.out.println(in.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
