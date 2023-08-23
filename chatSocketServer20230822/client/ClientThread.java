package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ClientThread extends Thread {
	
	private Socket socket;
	
	public ClientThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		InputStreamReader entrada;
		try {
			entrada = new InputStreamReader(socket.getInputStream());
			BufferedReader leitor = new BufferedReader(entrada);
			String mensagem;
			
			while ((mensagem = leitor.readLine()) != null ) {
				System.out.println("Mensagem enviada: " + mensagem);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
