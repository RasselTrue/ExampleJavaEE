package ru.dansaranov.enterprise.servlets.product;

import ru.dansaranov.enterprise.dao.ProductDAO;
import ru.dansaranov.enterprise.entity.Product;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/product-create")
public class ProductCreateServlet extends HttpServlet {

    @Inject
    private ProductDAO productDAO;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        productDAO.merge(new Product());
        resp.sendRedirect("catalog");
    }

}