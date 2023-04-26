package network;

import java.net.*;
import java.io.*;
public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket srs = new ServerSocket(1356);
        Socket ss = srs.accept();
        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2=new BufferedReader(new InputStreamReader(ss.getInputStream()));
        DataOutputStream dos = new DataOutputStream(ss.getOutputStream());
        System.out.println("type exit to quit");
        while(true){
            String s1,s4;
            while((s1=br2.readLine())!=null){
                System.out.println("Client:"+s1);
                s4=br1.readLine();
                dos.writeBytes(s4+"\n");
            }
            ss.close();
            srs.close();
            dos.close();
            br1.close();
            System.exit(0);
        }
    }
}
