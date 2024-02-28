package server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {

	public static void main(String[] args) throws IOException {
		
		int port = 3333;
		ServerSocket server = new ServerSocket(port);
		
		System.out.println("Servidor rodando na porta " + port);
		
		while (true) {
			Socket newClient = server.accept();
			Scanner leitura = new Scanner(newClient.getInputStream());
			PrintWriter escrita = new PrintWriter(newClient.getOutputStream(), true);
			String mensagemRecebida = leitura.nextLine();
			
			System.out.println("Mensagem recebida: " + mensagemRecebida);
			
			mensagemRecebida = mensagemRecebida.toUpperCase();
			escrita.println(mensagemRecebida);
		}
		

	}

}
