package com.gmail.at.sichyuriyy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Deviders {

	public static void main(String []args) throws IOException{
		Scanner in = new Scanner(new File("input.txt"));
		FileWriter out = new FileWriter("output.txt");
		int num = in.nextInt();
		for(int i = 1; i * i <= num; i++) {
			if (num % i == 0) {
				out.write(i + " " + num / i + " ");
			}
		}
		in.close();
		out.close();
	}
}
