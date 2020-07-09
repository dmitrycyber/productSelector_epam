package by.epamtc.productSelector;

import by.epamtc.productSelector.entity.Product;
import by.epamtc.productSelector.models.UserRequestModel;
import by.epamtc.productSelector.services.ConsoleReader;
import by.epamtc.productSelector.services.creator.CreatorsContainer;
import by.epamtc.productSelector.services.creator.ProductCreator;
import by.epamtc.productSelector.services.formater.StringFormater;
import by.epamtc.productSelector.services.formater.StringFormaterImpl;
import by.epamtc.productSelector.services.loader.FileLoader;
import by.epamtc.productSelector.services.loader.Loader;

import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Stream;

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

