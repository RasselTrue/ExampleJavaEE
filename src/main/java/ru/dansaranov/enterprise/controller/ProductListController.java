package ru.dansaranov.enterprise.controller;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.dansaranov.enterprise.dao.ProductDAO;
import ru.dansaranov.enterprise.entity.Product;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.Collection;

@ViewScoped
@ManagedBean
public class ProductListController {
    @Inject
    private ProductDAO productDAO;

    @NotNull
    public Collection<Product> getProductList() {
        return productDAO.getProducts();
    }

    public void removeProductById(@Nullable final String productId) {
        productDAO.removeProductById(productId);
    }
}
