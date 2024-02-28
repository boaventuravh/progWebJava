package pweb2024_02_28_sockets_client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client = new Socket("10.133.15.1", 80); // máquina do professor no lab
		Scanner leitura = new Scanner(client.getInputStream());
		PrintWriter escrita = new PrintWriter(client.getOutputStream(), true);
		
		escrita.println("Testing, testing, things just got more interesting");
		
		String retorno = leitura.nextLine();
		System.out.println(retorno);

	}

}
