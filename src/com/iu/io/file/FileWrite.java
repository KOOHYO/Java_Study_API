package com.iu.io.file;

import java.io.File;
import java.io.FileWriter;

public class FileWrite {

	public void wriet() throws Exception {
		File file = new File("C:\\Study", "test.txt");
		FileWriter fw = new FileWriter(file);
		
		fw.write("new String");
	}
	
}
