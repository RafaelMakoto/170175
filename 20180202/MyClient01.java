import java.io.*;
import java.net.*;

public class MyClent01{
	public static void main(String args){
		byte[] buff = new byte[1024];
		Socket read = null;
		InputStream instr = null;
		boolean cont = true;

		try{

		readsock = new Socket(args[0],Integer.parseInt(args[1]));
		instr = readsock.getInputSrream();
		}

			} catch (IOException e){
				System.err.println("neterr");
				System.exit(1).
		}
	}
}