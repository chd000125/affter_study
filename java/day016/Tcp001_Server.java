package com.company.day016;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.time.LocalTime;

public class Tcp001_Server {
	public static void main(String[] args) {
		//1. 서버소켓 - 통신사[ , , , , , , ]
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(1407);
			System.out.println("[SERVER] 1. 서버준비완료. A/S센터  OPEN  +  2. 고객님 기다리는중"); 
		} catch (IOException e) { e.printStackTrace(); }
		
		//2. 클라이언트의 연결요청 상담사(Socket)랑 연결(accept)
		try {
			socket = serverSocket.accept(); 
			System.out.println("[SERVER] 4. 상담사랑 연결 함"); // 연결이되지않으면 뜨지 않음.
			Thread sender = new Sender(socket); sender.start(); 		//말하기 기능
			Thread receiver = new Receiver(socket); receiver.start();	//듣기 기능.
		} catch (IOException e) {  e.printStackTrace(); }
		
		
		//3. 데이터 주고받기
	}
}
// 말하기 실행 클래스
class Sender extends Thread {
	String who;
	SimpleDateFormat sdf;
	Socket socket;
	DataOutputStream out; // null
	public Sender() { super();  }
	public Sender(Socket socket) { // 상대방의 정보를 가지고 있음.
		super();
		this.socket = socket;
		this.who = "["+ ( socket.getPort()==1407 ? " Client" : "Server") + "]";
		this.sdf = new SimpleDateFormat("hh:mm:ss]");
		
		try {
			out = new DataOutputStream(socket.getOutputStream()); 
		} catch (IOException e) { e.printStackTrace(); }
	}
	//2. todo run
	public void run() {
		
		//Scanner sc = new Scanner(System.in);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// Buffered... 로도 연습해보기
		try {
		while ( out != null) {
				String data = in.readLine();
				if (data != null) {out.writeUTF(who+data); out.flush();}
			}
		} catch (Exception e) {//e.printStackTrace();
		}finally {
				try {
				if (in != null) {in.close();}
				if(!socket.isClosed()) {socket.close();}
				} catch (IOException e) { e.printStackTrace(); }
			}//end finally
	}//end run
}//end Sender

// 듣기 실행 클래스

class Receiver extends Thread{ //1. 상속
	Socket socket;
	DataInputStream in; // 정보를 받는 역할
	public Receiver() { super(); }
	public Receiver(Socket socket) {
		super();
		this.socket = socket; // 정보
		try {
			in = new DataInputStream(socket.getInputStream()); // 듣기 내용 키기
		} catch (IOException e) { e.printStackTrace(); }
	}// end this
	//2. run - 실행 클래스 todo 내용
		public void run() {
			try {
			while ( in != null) {
					System.out.println(in.readUTF()); // 상대방이 말 하는거 듣기
			}//end while
			} catch (Exception e) {
				System.out.println("통신을 마무리합니다 >> " + socket);}
			finally {
				try {
				if (in != null) {in.close();}
				if(!socket.isClosed()) {socket.close();}
				} catch (IOException e) { e.printStackTrace(); }
			}//end finally
		}//end run
	
	//3. start걸어서 실행
	
}// end Receiver