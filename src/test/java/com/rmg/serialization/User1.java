package com.rmg.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class User1 {

	public static void main(String[] args) throws Throwable, IOException {
		
		NFSGame nfs=new NFSGame(10, "jhon", 3, 10000);
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("./backup.ser"));
		out.writeObject(nfs);

	}

}
