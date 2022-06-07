package com.rmg.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class User1_nextDay {

	public static void main(String[] args) throws Throwable, IOException {
		
		ObjectInputStream oinput=new ObjectInputStream(new FileInputStream("./backup.ser"));
		NFSGame nfs=(NFSGame)oinput.readObject();
		
		System.out.println(nfs.level);
		System.out.println(nfs.life);
		System.out.println(nfs.score);
		System.out.println(nfs.name);

	}

}
