import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BytesToJson {
    static void main() {

        String [] fileLocations = {"/Users/bing-chillin/IdeaProjects/javaFiles/posts.json"};
        String postUrl = "https://jsonplaceholder.typicode.com/posts";

        URI uri = URI.create(postUrl);

        try (InputStream inputStream = uri.toURL().openStream();
        ) {

            byte[] bytes = inputStream.readAllBytes();
            Path path = Paths.get(fileLocations[0]);
            Files.write(path, bytes);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
