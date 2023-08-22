package server;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ServerSocket srv = new ServerSocket(1234);
		System.out.println("Servidor rodando na porta 1234...");

	}

}
