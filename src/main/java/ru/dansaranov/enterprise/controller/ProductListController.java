package ru.dansaranov.enterprise.controller;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.dansaranov.enterprise.dao.ProductDAO;
import ru.dansaranov.enterprise.entity.Product;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.Collection;
import java.util.List;

@ViewScoped
@ManagedBean
public class ProductListController {

    @Nullable
    private String categoryId;

    @Inject
    private ProductDAO productDAO;

    @NotNull
    public List<Product> getProductList() {
        if (categoryId == null || categoryId.isEmpty()) {
            return productDAO.getProducts();
        }
        return productDAO.getProductListByCategoryId(categoryId);
    }

    public void removeProductById(@Nullable final String productId) {
        productDAO.removeProductById(productId);
    }

    @Nullable
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(@Nullable final String categoryId) {
        this.categoryId = categoryId;
    }
}
