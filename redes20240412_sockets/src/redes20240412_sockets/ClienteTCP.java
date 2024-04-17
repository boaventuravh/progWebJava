package redes20240412_sockets;


import java.io.*;
import java.net.*;

public class ClienteTCP {
      public static void main(String argv[]) throws Exception {
        String frase;
        String fraseModificada;
        BufferedReader doUsuario =
        new BufferedReader(new InputStreamReader(System.in));
        Socket socketCliente = new Socket("10.135.18.72", 6789);
        DataOutputStream paraServidor =
        new DataOutputStream(socketCliente.getOutputStream());
        BufferedReader doServidor =
        new BufferedReader(new
        InputStreamReader(socketCliente.getInputStream()));
        frase = doUsuario.readLine();
        paraServidor.writeBytes(frase + " My name is Miles Morales. I was bitten by a radioactive spider.");
        fraseModificada = doServidor.readLine();
        System.out.println("Do Servidor: " + fraseModificada);
        socketCliente.close();
    }

}
