package filehandling;

import java.io.File;                  
import java.io.FileNotFoundException; 
import java.util.Scanner;             

public class ReadFromFile {
  public static void main(String[] args) {
    File f1 = new File("Student.txt");

    try (Scanner myReader = new Scanner(f1)) {
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}