package by.epamtc.selector.services.formater;
import by.epamtc.selector.models.UserRequestModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringFormaterImpl implements StringFormater {

    private final String SpecialSymbolsBesideUnderScoreRegex = "[^A-z]+_";

    @Override
    public String removeSpecialSymbolsBesideUnderScore(String string) {
        return string
                .trim()
                .replaceAll(" ", "")
                .replaceAll(SpecialSymbolsBesideUnderScoreRegex, "");
    }

    @Override
    public List<Map<String, String>> filterByUserRequest(List<String> stringList, UserRequestModel userRequest) {
        List<String> filterByType = filterByType(stringList, userRequest.getType());
        return filterByParameters(filterByType, userRequest.getProperty(), userRequest.getValue(), userRequest.getType());
    }


    private List<String> filterByType(List<String> stringList, String type) {
        List<String> sortedString = new ArrayList<>();
        for (String line : stringList) {
            if (line.startsWith(type)) {
                sortedString.add(line);
            }
        }
        return sortedString;
    }


    private List<Map<String, String>> filterByParameters(List<String> stringList, String property, String value, String type) {
        List<Map<String, String>> parametersList = new ArrayList<>();

        for (int i = 0; i < stringList.size(); i++) {
            String line = stringList.get(i);

            if (line.contains(property + "=" + value)){
                if (!isLineFormatted(line)){
                    System.out.println("WARNING!: " + line + "\n" + "Line is not formatted");
//                    throw new LineFormatException("Line is not formatted");
                    continue;
                }
                Map<String, String> parametersOfProduct = new HashMap<>();
                parametersOfProduct.put("TYPE", type);
                String paramsOfProduct = line.replaceAll(type + ":", "");
                String[] split = paramsOfProduct.split(",");

                for (int j = 0; j < split.length; j++) {
                    String[] split1 = split[j].split("=");

                    for (int k = 0; k < split1.length; k++) {
                        parametersOfProduct.put(split1[0], split1[1]);
                    }
                }
                parametersList.add(parametersOfProduct);
            }
        }
        return parametersList;
    }

    private boolean isLineFormatted(String line){
        int equalsCount = 0;
        int commasCount = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '='){
                equalsCount++;
            }
            if (line.charAt(i) == ','){
                commasCount++;
            }
        }
        return equalsCount == commasCount+1;
    }
}
