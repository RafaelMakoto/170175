  import java.net.Socket;
  import java.io.IOException;
  import java.io.InputStream;
  import java.io.InputStreamReader;
  import java.io.BufferedReader;
  
  public class Netclock {
  	// data
  	// method
  	// main
  	public static void main (String[] args) {
  		// 変数宣言
  		Socket sock = null;
  		InputStream is = null;
  		InputStreamReader isr = null;
  		BufferedReader br = null;
  
  		// サーバに接続して～する
  		try {
  			// IPアドレスとポート番号を取得する
  			String ipAddr = args[0];
  			int portNum = Integer.parseInt(args[1]);
  
  			// サーバに接続する
  			sock = new Socket(ipAddr, portNum);
  			System.out.println("サーバに接続しました.");
  
  			// 入力ストリームを取得する
  			is = sock.getInputStream();
  			// InputStreamReaderを生成する
  			isr = new InputStreamReader(is);
  			// BufferedReaderを生成する
  			br = new BufferedReader(isr);
  
  			// データを受信する
  			String serverData = br.readLine();
  
  			// 受信したデータを出力する
  			System.out.println("受信データ: "+serverData);
  
  		} catch (IOException e) {
  			System.err.println("クライアントエラー");
  			System.exit(1);
  		}
  	}
  }