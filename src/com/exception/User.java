package com.exception;

import java.io.*;
import java.io.IOException;

public class User {
public static void main(String[] args) {
	DataInputStream dis=new DataInputStream(System.in);
	System.out.println("Enter your name");
	String name=" ";
	try {
		name =dis.readLine();
	}catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("Hai "+name+ " Welcome to UST");
}
}
