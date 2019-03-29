package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		PrintStream ps = new PrintStream("lorem2.txt");

		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println("id est laborum.");
		ps.close();
	}

	public void printWriter() throws IOException {
		PrintWriter pw = new PrintWriter("lorem2.txt");

		pw.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		pw.println();
		pw.println("id est laborum.");
		pw.close();
	}
}
