import java.util.*;
import java.io.*;
import java.nio.file.*;


public class FileHandling{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a file name: ");
    String filename = s.nextLine();
    
    //Reading a file
    try{
      BufferedReader reader = new BufferedReader(new FileReader(filename));
      
      String line;
      while((line = reader.readLine()) != null){
        System.out.println(line);
      }
    }catch(FileNotFoundException e){
      System.out.println("File does not exist");
    }
    catch(IOException e){
      e.printStackTrace();
    }

    //writing a file
    try{
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename,true));
        //here we added true if file pre-exists append the text to the file
        writer.newLine();
        writer.write("Hello i am add this to file");
        System.out.println("Written in file "+filename);
        writer.close();
      }
      catch(IOException e){
        e.printStackTrace();
      }
      
    s.close();
  }
}
