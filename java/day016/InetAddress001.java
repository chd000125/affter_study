package com.company.day016;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress001 {
	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("1. IP HOSTNAME : " + local.getHostName());
			System.out.println("2. IP HOSTADDRESS : " + local.getHostAddress());
			
			local = InetAddress.getByName("www.naver.com");
			System.out.println("3. NAVER : " + local);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
