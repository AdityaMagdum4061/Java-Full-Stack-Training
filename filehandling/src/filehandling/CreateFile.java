package filehandling;
import java.io.File;       
import java.io.IOException; 

public class CreateFile {
  public static void main(String[] args) throws IOException {
      File f1 = new File("Student.txt"); 
      if (f1.createNewFile()) {       
        System.out.println("File created: " + f1.getName());
      } else {
        System.out.println("File already exists.");
      }
  }
}