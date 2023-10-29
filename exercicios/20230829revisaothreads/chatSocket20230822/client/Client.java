package client;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws IOException {

		Socket socket = new Socket("localhost", 1234);
		Scanner scanner =  new Scanner(System.in);
		
		ClientThread clientThread = new ClientThread(socket);
		clientThread.start();
		PrintStream saida = new PrintStream(socket.getOutputStream());
		String teclado = scanner.nextLine();
		saida.println(teclado);

	}

}
