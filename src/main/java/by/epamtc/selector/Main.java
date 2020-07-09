package by.epamtc.selector;

import by.epamtc.selector.entity.Product;
import by.epamtc.selector.models.UserRequestModel;
import by.epamtc.selector.services.ConsoleReader;
import by.epamtc.selector.services.creator.CreatorsContainer;
import by.epamtc.selector.services.formater.StringFormater;
import by.epamtc.selector.services.formater.StringFormaterImpl;
import by.epamtc.selector.services.loader.FileLoader;
import by.epamtc.selector.services.loader.Loader;

import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Loader loader = new FileLoader("appliances_db.txt");
        List<String> strings = loader.linesFromResource();


        ConsoleReader consoleReader = new ConsoleReader();
        UserRequestModel userRequest = consoleReader.readUserRequest();

        StringFormater stringFormater = new StringFormaterImpl();
        List<Map<String, String>> maps = stringFormater.filterByUserRequest(strings, userRequest);

        CreatorsContainer creatorsContainer = new CreatorsContainer();

        List<Product> products = new ArrayList<>();

        for (int i = 0; i < maps.size(); i++) {
            Product product = creatorsContainer.getCreatorMap().get(maps.get(i).get("TYPE")).create(maps.get(i));
            products.add(product);
        }

        System.out.println(products);
    }
}

