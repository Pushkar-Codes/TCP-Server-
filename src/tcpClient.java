//import java.net.*;
//import java.io.*;
//import java.util.*;
//
//public class tcpClient {
//    public static void main(String[] args) {
//        try {
//            Socket s = new Socket("localhost", 1000);
//            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
//
//            Scanner sc = new Scanner(System.in);
//            String x = sc.nextLine();
//
//            dout.writeUTF(x);
//            dout.flush();
//            dout.close();
//            s.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}

import java.net.*;
import java.io.*;
import java.util.*;

public class tcpClient {
    public static void main(String[] args)throws Exception{
        Socket s = new Socket("localhost", 1000);
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());

        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();

        dout.writeUTF(x);
        dout.flush();
        dout.close();
        s.close();

    }
}