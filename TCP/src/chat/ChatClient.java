package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChatClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket = new Socket("localhost" , 3333);
		DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
		DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
		Scanner scanner = new Scanner(System.in);
		
		while (true){
			String str = scanner.nextLine();
			dataOutputStream.writeUTF(str);
			dataOutputStream.flush();
			if (str.equals("quit")){
				break;
			}
			
		String str2 = dataInputStream.readUTF();
		System.out.println("Server said: "+str2);
		}
		
		socket.close();
		dataInputStream.close();
		dataOutputStream.close();
	}

}
