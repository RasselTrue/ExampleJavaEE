package ru.dansaranov.enterprise.dao;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.dansaranov.enterprise.entity.Product;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

@ApplicationScoped
public class ProductDAO {

    @NotNull
    private Map<String, Product> products = new LinkedHashMap<>();

    @PostConstruct
    private void init() {
        merge(new Product("DEMO PRODUCT"));
    }

    @NotNull
    public Collection<Product> getProducts() {
        return products.values();
    }

    @Nullable
    public Product getProductById(@Nullable final String productId) {
        if (productId == null || productId.isEmpty()) return null;
        return products.get(productId);
    }

    @Nullable
    public Product merge(@Nullable final Product product) {
        if (product == null) return null;
        @Nullable final String id = product.getId();
        if (id == null || id.isEmpty()) return null;
        products.put(id, product);
        return product;
    }

    public void removeProductById(@Nullable String productId) {
        if (productId == null || productId.isEmpty()) return;
        if (!products.containsKey(productId)) return;
        products.remove(productId);
    }
}
