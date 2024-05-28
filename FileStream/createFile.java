import java.util.*;
import java.io.*;
import java.nio.file.*;


public class createFile{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a file name: ");
    String filename = s.nextLine();
    File file = new File(filename);
    try{
      if(file.createNewFile()){
        System.out.println("File created: " + file.getName());
      }
      else{
        System.out.println("File already exists.");
      }
    }
    catch(IOException e){
      e.printStackTrace();
    }
  }
}
