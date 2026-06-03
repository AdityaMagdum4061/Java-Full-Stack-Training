package exceptions;

import java.io.*;

public class ThrowsDemo {

	static void readFile() throws IOException {
		FileReader fr = new FileReader("data.txt");
	}

	public static void main(String[] args) throws IOException {

		readFile();
	}
}