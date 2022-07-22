package com.iu.io.file;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadMain {

	public static void main(String[] args) {
		FileRead fr = new FileRead();
		FileWrite fw = new FileWrite();
		try {
			fr.read();
			fw.write();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	
}
