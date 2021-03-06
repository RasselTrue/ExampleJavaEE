package ru.dansaranov.enterprise.controller;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.dansaranov.enterprise.dao.CategoryDAO;
import ru.dansaranov.enterprise.dao.ProductDAO;
import ru.dansaranov.enterprise.entity.Product;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ViewScoped
@ManagedBean
public class ProductEditController {

    @Inject
    private ProductDAO productDAO;

    @Inject
    private CategoryDAO categoryDAO;

    @Nullable
    private String id;

    @Nullable
    private String categoryId;

    @NotNull
    private Product product = new Product();

    public void init() {
        @Nullable final Product product = productDAO.getProductById(id);
        if (product != null) {
            this.product = product;
        }
    }

    @NotNull
    public String save() {
        if (categoryId != null) product.setCategory(categoryDAO.getCategoryById(categoryId));
        productDAO.merge(product);
        return "product-list";
    }

    @NotNull
    public Product getProduct() {
        return product;
    }

    public void setProduct(@NotNull final Product product) {
        this.product = product;
    }

    @Nullable
    public String getId() {
        return id;
    }

    public void setId(@Nullable final String id) {
        this.id = id;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}
