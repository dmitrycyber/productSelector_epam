import java.util.*;

public class ConsoleReader {
    private Scanner sc = new Scanner(System.in);
    private String type;
    private Announcer announcer = new Announcer();

    public List<String> sortedStringByType(List<String> lines){
        announcer.enterType();
        type = sc.next();
        List<String> sortedString = new ArrayList<>();

        for (String line : lines) {
            if (line.startsWith(type)) {
                sortedString.add(line);
            }
        }
        return sortedString;
    }

    public List<Product> sortedStringByProperty(List<String> lines){
        announcer.enterProperty();
        String property = sc.next();

        announcer.enterValue();
        String value = sc.next();

        List<Product> productList = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            if (line.contains(property + "=" + value)){
                Map<String, String> parameters = new HashMap<>();
                parameters.put("TYPE", type);
                String paramsOfProduct = line.replaceAll(type + ":", "");

                String[] split = paramsOfProduct.split(",");
                for (int j = 0; j < split.length; j++) {
                    String[] split1 = split[j].split("=");
                    for (int k = 0; k < split1.length; k++) {
                        parameters.put(split1[0], split1[1]);
                    }
                }
                Product product = new ProductContainer(parameters).getProductsMap().get(type);
                productList.add(product);
            }
        }

        return productList;
    }
}
