import java.net.*;
import java.io.*;

public class MyServer1{
	public static void main(String[] args){

		ServerSoket sk = null;
		Soket sock;
		try{

			sk = new ServerSoket(6000,30);
			while(true){
				sock = ServerSoket.accept();
				System.out.println("GOD");

				sock.close();
			}
		} catch(IOException e){
			System.exit(1);
		}

	}
}