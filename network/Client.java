package network;

import java.net.*;
import java.io.*;
public class Client {
    public static void main(String[] args) throws Exception {

        Socket cs = new Socket("localhost",1356);
        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2=new BufferedReader(new InputStreamReader(cs.getInputStream()));
        DataOutputStream dos = new DataOutputStream(cs.getOutputStream());
        String s2,s3=null;
        while(!(s2=br1.readLine()).equals("exit")){
            dos.writeBytes(s2+"\n");
            s3= br2.readLine();
            System.out.println("Server:"+s3);
        }
        cs.close();
        dos.close();
        br1.close();
    }
}
