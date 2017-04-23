package lab7;

import java.io.*;
import java.net.*;

public class TCPstreamSocketServer 
{
	public static void main(String[] args) 
	{
        int port = 2500; 
        
        ServerSocket serverSocket = null; 
        
        try { 
			// creating socket on the following port 
	        serverSocket = new ServerSocket(port);
	        System.out.println("Server accpeting connection on port: " + port);
	        System.out.println("Waiting for client(s) to connect . . .");
	        
	        // start server thread 
	        while(true) {
	        	TCPserverThread clientThread = new TCPserverThread(serverSocket.accept()); 
		        clientThread.start();
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


	

