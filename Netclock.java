 import java.io.*;
 import java.net.*;
 import java.util.*;
 
 public class Netclock{
 	public static void main(String[] atgs){
 		byte[] buff = new byte[1024];
 		ServerSocket servsock = null;
 		Socket sock;
 		OutputStream  out;
 		InputStream instr;
 		String	msg;
 		int i;
 		Date d;
 		boolean cont = true;
 
 		try{
 			servsock = new ServerSocket(6000, 300);
 
 			while(true){
 				sock 	=	servsock.accept();
 					System.out.println("conekte");
 
 					d = new Date();
 				
 				msg  = "\n"
 				+"ALOHA, this is Rafael Netclock server"+"\n"
 				+d.toString() +
 				"\n"+	"Onbrigado" + "\n";
 				
 				out =	sock.getOutputStream();
 
 				for(i=0; i<msg.length();	i++)
 					out.write((int)msg.charAt(i));
 				out.write('\n');
 				instr = sock.getInputStream();
 
 				while(cont){
 					try{
 						int n = instr.read(buff);
 						
 					}catch(IOException e){
 						cont = false;
 					}
 				}
 
 				sock.close();
 			}
 		}catch (IOException e){
 			System.exit(1);
 		}
 	}
 }