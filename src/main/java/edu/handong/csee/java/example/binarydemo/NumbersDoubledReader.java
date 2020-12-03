package edu.handong.csee.java.example.binarydemo;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class NumbersDoubledReader {

	public static void main(String[] args) {
		BinaryInputEOFDemo main = new BinaryInputEOFDemo();
		main.run();
	}

	private void run() {
		String fileName = "numbersDoubled.bat";
		
		try {
			ObjectInputStream inputStream = new ObjectInputStream(
								new FileInputStream(fileName));
		
			while(true) {
				int anInteger = inputStream.readInt();
				System.out.println(anInteger);
			}
		} catch(FileNotFoundException e) {
			System.out.println("Problem opening the file " + fileName);
		} catch (EOFException e) {
			System.out.println("Reached end of the file.");
		} catch (IOException e) {
			System.out.println("Problem reading the file " + fileName);
		}
	}
}
