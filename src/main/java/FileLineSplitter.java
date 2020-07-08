import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileLineSplitter {
    public List<String> getLinesFromFile(String pathToFile) throws FileNotFoundException {
        FileReader fileReader = new FileReader(pathToFile);
        Scanner sc = new Scanner(fileReader);
        List<String> allLines = new ArrayList<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.length() == 0) {
                continue;
            }
            allLines.add(line
                    .trim()
                    .replaceAll(" ", "")
                    .replaceAll("[^A-z]+_", ""));
        }
        return allLines;
    }
}
