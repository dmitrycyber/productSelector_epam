import java.util.HashMap;
import java.util.Map;

public class ProductContainer {
    private Map<String, Product> productsMap;

    public ProductContainer() {
        productsMap = new HashMap<>();
        productsMap.put("Oven", new Oven());
        productsMap.put("Laptop", new Laptop());
        productsMap.put("Refrigerator", new Refrigerator());
        productsMap.put("VacuumCleaner", new VacuumCleaner());
        productsMap.put("TabletPC", new TabletPC());
        productsMap.put("Speakers", new Speakers());
    }

    public Map<String, Product> getProductsMap() {
        return productsMap;
    }
}
