package br.com.alura.java.io.teste;

import java.io.Reader;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		// Fluxo de entrada com arquivo
		InputStream fis = new FileInputStream("lorem1.txt");
		Reader isr = new InputStreamReader(fis);
		//Reader isr = new InputStreamReader(fis, "UTF-16"); //Lendo com encode incorreto
		BufferedReader br = new BufferedReader(isr);

		String linha = br.readLine();

		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}

		br.close();
	}

}
