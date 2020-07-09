package by.epamtc.productSelector.services;

import by.epamtc.productSelector.models.UserRequestModel;
import by.epamtc.productSelector.services.announcer.Announcer;
import by.epamtc.productSelector.services.announcer.SimpleAnnouncer;

import java.util.*;

public class ConsoleReader {
    private Scanner sc = new Scanner(System.in);
    private String type;
    private Announcer announcer;

    public ConsoleReader() {
        announcer = new SimpleAnnouncer();
    }

    public UserRequestModel readUserRequest(){
        announcer.enterType();
        String type = sc.next();
        announcer.enterProperty();
        String property = sc.next();
        announcer.enterValue();
        String value = sc.next();
        return new UserRequestModel(type, property, value);
    }
}
