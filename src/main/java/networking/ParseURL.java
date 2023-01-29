package networking;

import java.net.MalformedURLException;
import java.net.URL;

public class ParseURL {
    public static void main(String args[]) throws MalformedURLException {
        URL url = new URL("http://search.oreilly.com:80/index.html?q=kousen&x=0&y=0#REFERENCE");
        System.out.println("Protocol =  " + url.getProtocol());
        System.out.println("Authority = " + url.getAuthority());
        System.out.println("Host = " + url.getHost());
        System.out.println("Port = " + url.getPort());
        System.out.println("Path = " + url.getPath());
        System.out.println("Query = " + url.getQuery());
        System.out.println("FileName = " + url.getFile());
        System.out.println("Reference = " + url.getRef());
    }
}
