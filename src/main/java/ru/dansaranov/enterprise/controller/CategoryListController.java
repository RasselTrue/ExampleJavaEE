package ru.dansaranov.enterprise.controller;

import org.jetbrains.annotations.Nullable;
import ru.dansaranov.enterprise.dao.CategoryDAO;
import ru.dansaranov.enterprise.entity.Category;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ViewScoped
@ManagedBean
public class CategoryListController {

    @Inject
    private CategoryDAO categoryDAO;

    public List<Category> getCategoryList() {
        return categoryDAO.getCategories();
    }

    public void removeCategoryById(@Nullable final String categoryId) {
        categoryDAO.removeCategoryById(categoryId);
    }
}
