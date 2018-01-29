import java.io.*;
import java.net.*;

public class Readnte
{
	public static void main(String[] args)
	{
		while(true){
		byte[]	buff	=	new byte[1024];
		Socket	readsock	=	null;
		InputStream	instr 	=	null;
		boolean cont 	= true;



		try{
			readsock	= new Socket(args[0], Integer.parseInt(args[1]));
			instr 	=	readsock.getInputStream();
		}
		catch (Exception e){
			System.err.println("networkerr");
			System.exit(1);
		}

		while(cont)
		{
			try{
				int n 	=	instr.read(buff);
				System.out.write(buff, 0, n);
			}

			catch (Exception e){
				cont 	=	false;
			}
		}

		try{
			instr.close();
		}
		catch (Exception e){
			System.err.println("networkerr");
			System.exit(1);
		}
	}

	}
}