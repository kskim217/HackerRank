package com.hacker.rank.practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Util {
	public static String path = Util.class.getResource("").getPath();
	public static Scanner getScanner() {
		File file = new File(path + "text_in.txt");
		Scanner input = null;
		try {
			input = new Scanner(file);
			return input;
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	public static void println(Object text){
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(path + "text_out.txt", true)))) {
		    out.println(text);
		}catch (IOException e) {
		    System.err.println(e);
		}
	}
}
