package networking;

import java.net.InetAddress;

public class LocalAddress {
    public static void main(String args[]) {
        try {
            System.out.println(InetAddress.getLocalHost());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
