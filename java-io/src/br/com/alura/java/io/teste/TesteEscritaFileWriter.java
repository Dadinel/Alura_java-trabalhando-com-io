package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("lorem2.txt");

		fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		//fw.write("\r\n");
		fw.write(System.lineSeparator());
		fw.write(System.lineSeparator());
		fw.write("id est laborum.");
		fw.close();
	}

	public void bufferWriter() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.newLine();
		bw.write("id est laborum.");
		bw.close();
	}

}
