package ru.dansaranov.enterprise.servlets.product;

import ru.dansaranov.enterprise.FieldConst;
import ru.dansaranov.enterprise.dao.ProductDAO;
import ru.dansaranov.enterprise.entity.Product;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/product-save")
public class ProductSaveServlet extends HttpServlet {

    @Inject
    private ProductDAO productDAO;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String id = req.getParameter(FieldConst.ID);
        if (id == null || id.isEmpty()) {
            sendRedirectProjectList(resp);
            return;
        }
        final Product product = productDAO.getProductById(id);
        if (product == null) {
            sendRedirectProjectList(resp);
            return;
        }
        product.setName(req.getParameter(FieldConst.NAME));
        product.setDescription(req.getParameter(FieldConst.DESCRIPTION));
        productDAO.merge(product);
        sendRedirectProjectList(resp);
    }

    private void sendRedirectProjectList(HttpServletResponse resp) throws IOException {
        resp.sendRedirect("catalog");
    }

}
