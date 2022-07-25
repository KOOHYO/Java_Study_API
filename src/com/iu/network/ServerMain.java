package com.iu.network;

public class ServerMain {

	public static void main(String[] args) {
		System.out.println("Server Start");
		Server1 s1 = new Server1();
		
		try {
			s1.receive();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Server Finish");
	}

}
