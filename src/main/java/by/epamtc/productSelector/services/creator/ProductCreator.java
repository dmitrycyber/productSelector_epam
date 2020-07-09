package by.epamtc.productSelector.services.creator;

import by.epamtc.productSelector.entity.Product;

import java.util.Map;

public interface ProductCreator {
    Product create(Map<String, String> parameters);
}
