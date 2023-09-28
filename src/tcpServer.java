//import java.net.*;
//import java.io.*;
//import java.util.*;
//
//public class tcpServer {
//    public static void main(String[] args) {
//
//        try {
//            ServerSocket ss = new ServerSocket(1000);
//            Socket s = ss.accept();
//            DataInputStream dis = new DataInputStream(s.getInputStream());
//
//            String str = (String)dis.readUTF();
//
//            System.out.println("Message: "+str);
//
//
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//    }
//
//}


import java.net.*;
import java.io.*;
import java.util.*;

public class tcpServer {
    public static void main(String[] args)throws Exception {
        ServerSocket ss = new ServerSocket(1000);
        Socket s = ss.accept();

        DataInputStream dis = new DataInputStream(s.getInputStream());

        String str = (String)dis.readUTF();

        System.out.println("Message: "+str);


    }
}