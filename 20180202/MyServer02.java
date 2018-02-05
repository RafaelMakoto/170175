import java.net.*;
import java.io.*;
import java.util.*;

public class MyServer2{
	public static void main(String[] args){

		ServerSoket sk = null;
		Soket sock;
		OutputStream out;
		String otr;
		int i;
		Date d;

		try{

			sk = new ServerSoket(6000,30);
			while(true){
				sock = ServerSoket.accept();
				System.out.println("GOD");

				d = new Date();

				otr = "\n"
				+ "Hello, this is MyNetclock Server."
				+	"\n"	+	d.toString()	+	"\n"
  				+	"Thank you."	+	"\n";

  				out = sock.getOutputStream();
  				for(i=0; i<otr.length(); i++)
  					out.write((int)outstr.charAt(i));
  				out.write('\n');
				sock.close();
			}
		} catch(IOException e){
			System.exit(1);
		}

	}
}