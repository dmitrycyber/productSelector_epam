package by.epamtc.productSelector.services.loader;

import by.epamtc.productSelector.services.formater.StringFormater;
import by.epamtc.productSelector.services.formater.StringFormaterImpl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileLoader implements Loader {
    private StringFormater stringFormater;
    private FileReader fileReader;

    public FileLoader(String fileName) throws FileNotFoundException {
        stringFormater = new StringFormaterImpl();
        fileReader = new FileReader(getClass().getClassLoader().getResource(fileName).getPath());
    }

    @Override
    public List<String> linesFromResource() {
        Scanner sc = new Scanner(fileReader);
        List<String> allLines = new ArrayList<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.length() == 0) {
                continue;
            }
            allLines.add(stringFormater.removeSpecialSymbolsBesideUnderScore(line));
        }
        return allLines;
    }
}
