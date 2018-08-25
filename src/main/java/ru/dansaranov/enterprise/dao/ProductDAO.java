package ru.dansaranov.enterprise.dao;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.dansaranov.enterprise.entity.Product;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import java.util.*;

@Stateless
public class ProductDAO extends AbstractDAO{

    public Product findOne(String id) {
        return em.find(Product.class, id);
    }

    @NotNull
    public List<Product> getProducts() {
        return em.createQuery("SELECT e FROM Product e ORDER BY  e.created DESC", Product.class).getResultList();
    }

    public List<Product> getProductListByCategoryId(@Nullable final String categoryId) {
        if (categoryId == null || categoryId.isEmpty()) return Collections.emptyList();
        return em.createQuery("SELECT e FROM Product e WHERE e.category.id = :categoryId ORDER BY e.created", Product.class)
                .setParameter("categoryId", categoryId).getResultList();
    }

    @Nullable
    public Product getProductById(@Nullable final String productId) {
        if (productId == null || productId.isEmpty()) return null;
        return getEntity(em.createQuery("SELECT e FROM Product e WHERE e.id =:id", Product.class)
                .setParameter("id", productId)
                .setMaxResults(1));
    }

    @Nullable
    public Product persist(@Nullable final Product product) {
        if (product == null) return null;
        em.persist(product);
        return product;
    }

    @Nullable
    public Product merge(@Nullable final Product product) {
        if (product == null) return null;
        return em.merge(product);
    }

    public void removeProductById(@Nullable final String productId) {
        @Nullable final Product product = getProductById(productId);
        if (product == null) return;
        em.remove(product);
    }


}
