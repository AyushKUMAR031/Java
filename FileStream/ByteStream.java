import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream{
    public static void main(String[] args) {
        // Specify input and output file paths
        String inputFilePath = "f1.txt";
        String outputFilePath = "output.txt";

        try {
            // Create FileInputStream for reading from input file
            FileInputStream fis = new FileInputStream(inputFilePath);
            
            // Create FileOutputStream for writing to output file
            FileOutputStream fos = new FileOutputStream(outputFilePath);
         
            // Read bytes from input file and write them to output file
            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                fos.write(byteRead);
            }
            
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            // Handle any IO exceptions
            e.printStackTrace();
        }
    }
}
