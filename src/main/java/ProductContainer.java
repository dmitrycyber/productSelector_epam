import java.util.HashMap;
import java.util.Map;

public class ProductContainer {
    private Map<String, Product> productsMap;

    public ProductContainer(Map<String, String> params) {
        productsMap = new HashMap<>();
        productsMap.put("Oven", new Oven(params));
        productsMap.put("Laptop", new Laptop(params));
        productsMap.put("Refrigerator", new Refrigerator(params));
        productsMap.put("VacuumCleaner", new VacuumCleaner(params));
        productsMap.put("TabletPC", new TabletPC(params));
        productsMap.put("Speakers", new Speakers(params));
    }

    public Map<String, Product> getProductsMap() {
        return productsMap;
    }
}
