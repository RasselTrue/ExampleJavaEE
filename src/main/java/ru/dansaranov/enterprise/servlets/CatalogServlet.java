package ru.dansaranov.enterprise.servlets;

import ru.dansaranov.enterprise.FieldConst;
import ru.dansaranov.enterprise.dao.ProductDAO;
import ru.dansaranov.enterprise.entity.Product;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

@WebServlet(name = CatalogServlet.NAME, urlPatterns = {"/catalog"})
public class CatalogServlet extends HttpServlet {

    public static final String NAME = "CatalogServlet";

    @Inject
    private ProductDAO productDAO;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final Collection<Product> products = productDAO.getProducts();
        req.setAttribute(FieldConst.PRODUCTS, products);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/catalog.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
