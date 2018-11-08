import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client {
	public static void main(String args[]) throws UnknownHostException, IOException{
		Socket socket = new Socket("localhost", 12345);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeUTF("send");
		out.close();
		socket.close();
		
		ServerSocket serverRecieve = new ServerSocket(54321);
		Socket socketRecieve = serverRecieve.accept();
		InputStream in = socketRecieve.getInputStream();
		FileOutputStream outFile = new FileOutputStream("Client//Untitled.png");
		byte[] buffer = new byte[1024];
		int count;
		while ((count=in.read(buffer))>=0){
			outFile.write(buffer, 0, count);
		}
		outFile.close();
		in.close();
		socketRecieve.close();
		serverRecieve.close();
	}
}
