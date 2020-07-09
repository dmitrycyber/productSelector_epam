package by.epamtc.selector.services.loader;

import java.io.FileNotFoundException;
import java.util.List;

public interface Loader {
    List<String> linesFromResource() throws FileNotFoundException;
}
