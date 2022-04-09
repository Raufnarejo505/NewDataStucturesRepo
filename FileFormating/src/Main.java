import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        // Create a file object
        String folderPath= "H:\\MainFolder";
        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        // Iterate through files array
        for(File file:files){
            // check if the file is
            if(file.isFile()) {
                String fileName = file.toString();
                int index = fileName.lastIndexOf('.');
                if (index > 0) {
                    String extension = fileName.substring(index + 1);
                    System.out.println(fileName + "\t" + extension);
                    Path temp = Files.move(Paths.get(fileName),
                            Paths.get("H:\\CopyFolder\\Documents"));

                    if(temp != null)
                    {
                        System.out.println("File renamed and moved successfully");
                    }
                    else
                    {
                        System.out.println("Failed to move the file");
                    }
                }
            }
        }




    }

}
