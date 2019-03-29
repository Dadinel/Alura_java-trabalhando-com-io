package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "ç";

		System.out.println(s.codePointAt(0));

		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		System.out.println();

		byte[] bytes = s.getBytes("windows-1252");
		System.out.print(bytes.length + ", windows-1252, ");
		String sNovo = new String(bytes, "windows-1252");
		System.out.println(sNovo);
		System.out.println();

		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length + ", UTF-16, ");
		sNovo = new String(bytes, "UTF-16");
		System.out.println(sNovo);
		System.out.println();

		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length + ", UTF-16, ");
		sNovo = new String(bytes, "windows-1252");
		System.out.println(sNovo);
		System.out.println();

		bytes = s.getBytes("UTF-8");
		System.out.print(bytes.length + ", UTF-8, ");
		sNovo = new String(bytes, "UTF-8");
		System.out.println(sNovo);
		System.out.println();

		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes.length + ", " + StandardCharsets.US_ASCII.displayName() + ", ");
		sNovo = new String(bytes, StandardCharsets.US_ASCII);
		System.out.println(sNovo);
		System.out.println();		
	}
}
