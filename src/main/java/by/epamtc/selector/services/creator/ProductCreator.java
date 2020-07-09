package by.epamtc.selector.services.creator;

import by.epamtc.selector.entity.Product;

import java.util.Map;

public interface ProductCreator {
    Product create(Map<String, String> parameters);
}
