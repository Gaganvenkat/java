import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        try {
            // Write to file
            FileWriter writer = new FileWriter("example.txt");
            writer.write("This is a test file.\n");
            writer.close();

            // Read from file
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
