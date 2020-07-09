package by.epamtc.selector.services.formater;

import by.epamtc.selector.models.UserRequestModel;

import java.util.List;
import java.util.Map;

public interface StringFormater {
    String removeSpecialSymbolsBesideUnderScore(String string);
    List<Map<String, String>> filterByUserRequest(List<String> stringList, UserRequestModel userRequest);


}
