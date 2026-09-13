import java.io.*;

public class FilesLearning {

    public static void main(String[] args) {


        String [] names = {"Ariyo", "Praise","Tayo"};

        try {
            BufferedWriter write = new BufferedWriter(new FileWriter("testing.txt"));
            write.write("Hello World on my first file\nalright");

            for (String  name : names) {
                write.write("\n" + name);
            }
            write.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            BufferedReader read = new BufferedReader(new FileReader("testing.txt"));
            String line;
            while ((line = read.readLine()) != null) {
                IO.println(line);
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
