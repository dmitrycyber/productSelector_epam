import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileLineSplitter fileLineSplitter = new FileLineSplitter();
        List<String> allLines = fileLineSplitter.getLinesFromFile("appliances_db.txt");
        ConsoleReader consoleReader = new ConsoleReader();
        List<String> sortedString = consoleReader.sortedStringByType(allLines);


        System.out.println(consoleReader.sortedStringByProperty(sortedString));
    }
}

