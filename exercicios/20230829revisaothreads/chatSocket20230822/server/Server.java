package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ServerSocket serverSocket = new ServerSocket(1234);
		System.out.println("Servidor rodando na porta 1234...");
		Socket socket = serverSocket.accept();
		System.out.println("Cliente conectado!");
		
		InputStreamReader entrada = new InputStreamReader(socket.getInputStream());
		PrintStream saida = new PrintStream(socket.getOutputStream());
		BufferedReader leitor = new BufferedReader(entrada);
		String mensagem;
		
		
		// ALTERAR A CONDIÇÃO P true
		// Colocar todo o trecho entre as linhas 17 e 23 para o escopo do laço
		while ((mensagem = leitor.readLine()) != null ) {
			System.out.println("Mensagem do client: " + mensagem);
			mensagem = leitor.readLine();
		}

	}

}
