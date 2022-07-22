package com.iu.io.file;

import java.io.File;

public class FileMain2 {

	public static void main(String[] args) {
		File file = new File("C:\\Study");
		String [] names = file.list();
		for(String s:names) {
			System.out.println(s);
		}
		File[] files = file.listFiles();
		for(File n : files) {
			if(n.isFile()) {
				if (n.length()==0) {
					n.delete();
				}
			}
		}

	}

}
