package lab7;

import java.io.*;
import java.net.*;

public class TCPstreamSocketServer 
{
	public static void main(String[] args) 
	{
        int port = 2500; 
        
        ServerSocket serverSocket = null; 
        Socket clientSocket = null; 
        BufferedReader fromClient; 
        String request = ""; 
        String response = ""; 
        PrintWriter toClient; 
        
        try { 
			// creating socket on the following port 
	        serverSocket = new ServerSocket(port);
	        System.out.println("Server accpeting connection on port: " + port);
	        System.out.println("Waiting for client(s) to connect . . .");
	        clientSocket = serverSocket.accept(); // server waiting for client(s) to connect 
	        System.out.println("Client(s) connected to the server\n"); 
	        
	        while(true) {
	            // read client's request
	            fromClient = new BufferedReader(
	                    new InputStreamReader(clientSocket.getInputStream()));
	            System.out.println("Waiting for client's request . . .");
	            request = fromClient.readLine(); 
	            System.out.println("Client's Request: " + request);
	            
	            // process client's request 
	            System.out.println("Processing client's request . . .");
	            switch(request) {
	            case "nextevenfib":
	            case "nextEvenFib": // nextEvenFib
	            	response = "nextEvenFib"; 
	            	break;
	            case "nextlargerrand":
	            case "nextLargerRand": // nextLargerRand
	            	response = "nextLargerRand"; 
	            	break; 
	            case "nextprime":
	            case "nextPrime": // nextPrime
	            	response = "nextPrime"; 
	            	break; 
	            default: // unknown request 
	            	response = "ERROR: Unknown Request! Cannot Process . . ."; 
	            }
	            
	            // send server's response 
	            toClient = new PrintWriter(clientSocket.getOutputStream(), true);
	            System.out.println("Server sending: " + response);
	            toClient.println(response);
	            System.out.println("Server's response sent!\n");
	            toClient.flush();
	        }
        } catch(IOException e) {
        	e.printStackTrace();
        	System.out.println("Exception caught when trying to listen on port " 
        			+ port + " or listening for a connection");
        	System.out.println(e.getMessage());
        } 
	} // end of main 
	
	
	//Dominick
	public double nextEvenFib()
	{
		return 0.0;
	}
	//Lori
	public int nextLargerRand() 
	{
		return 0;
	}
	//Steph
	public int nextPrime()
	{
		return 0;
	}
} // end of server program 


	

