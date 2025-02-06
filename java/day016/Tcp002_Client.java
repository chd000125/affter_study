package com.company.day016;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Tcp002_Client {
	public static void main(String[] args) {
		//2. 통신사 - 서버소켓이 열렸는지 확인하고  ( Server 먼저 실행 )
		Socket socket = null;
		try {
			socket = new Socket("127.0.0.1", 1407);
			System.out.println("[CLIENT] 3. A/S센터 문의......");
			
			Thread sender = new Sender(socket); sender.start(); 		//말하기 기능
			Thread receiver = new Receiver(socket); receiver.start();	//듣기 기능.
			
		} catch (UnknownHostException e) { e.printStackTrace();} // Host가 없을 수 있음.
		catch (IOException e) { e.printStackTrace(); } // Host는 있는데 연결 안될 수 있음.
		
		
		//3. 고객님 문의하기 ( Socket )
		
		
		
		
	}
}
