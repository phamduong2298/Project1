package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
	public static void main(String args[]) throws IOException{
		ServerSocket serverSocket = new ServerSocket(3333);
		Socket socket = serverSocket.accept();
		DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
		DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
		
		Scanner scanner = new Scanner(System.in);
		while (true){
			String str = dataInputStream.readUTF();
			if (str.equals("quit")){
				break;
			}
			System.out.println("Client said: "+ str);
			String str2 = scanner.nextLine();
			dataOutputStream.writeUTF(str2);
		}
		
		serverSocket.close();
		socket.close();
		dataInputStream.close();
		dataOutputStream.close();
		dataOutputStream.flush();
	}
}
