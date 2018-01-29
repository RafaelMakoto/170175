import java.io.*;
import java.net.*;
import java.util.*;

public class Wrnet{
	public static void main(String[] args){
		
		Socket sock = null;
		InputStream is = null;
		OutputStream os = null;

		try{
			sock = new Socket()
			is = sock.getInputStream();
			os = sock.getOutputStream();
			
			String msg = "ALOHA"

			
			is.close();
		}catch (IOException e){
			System.out.println("ネットワークエラー");
			System.exit(1);

		}
	}
}