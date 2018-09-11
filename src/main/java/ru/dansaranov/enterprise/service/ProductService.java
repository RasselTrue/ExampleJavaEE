package ru.dansaranov.enterprise.service;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.dansaranov.enterprise.dao.ProductDAO;
import ru.dansaranov.enterprise.dto.ProductDTO;
import ru.dansaranov.enterprise.dto.ResultDTO;
import ru.dansaranov.enterprise.entity.Product;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

@WebService
@Path("/ProductService")
public class ProductService {

    @Inject
    private ProductDAO productDAO;

    @GET
    @NotNull
    @WebMethod
    @Path("/ping")
    @Produces(MediaType.APPLICATION_JSON)
    public ResultDTO ping() {
        return new ResultDTO();
    }

    @GET
    @NotNull
    @WebMethod(operationName = "createProduct")
    @Path("/createProduct")
    @Produces(MediaType.APPLICATION_JSON)
    public ResultDTO createProduct() {
        productDAO.persist(new Product());
        return new ResultDTO();
    }

    @GET
    @NotNull
    @Path("/removeProductById")
    @WebMethod(operationName = "removeProductById")
    @Produces(MediaType.APPLICATION_JSON)
    public ResultDTO removeProductById(
            @QueryParam(value = "id")
            @WebParam(name = "id", partName = "id")
            @Nullable final String id
    ) {
        try {
            productDAO.removeProductById(id);
            return new ResultDTO();
        } catch (@NotNull final Exception e) {
            return new ResultDTO(false, e.getMessage());
        }
    }

    @GET
    @Nullable
    @Path("/getProductById")
    @WebMethod(operationName = "getProductById")
    @Produces(MediaType.APPLICATION_JSON)
    public ProductDTO getProductById(
            @QueryParam(value = "id")
            @WebParam(name = "id", partName = "id")
            @Nullable final String id
    ) {
        @Nullable final Product product = productDAO.getProductById(id);
        if (product == null) return null;
        return new ProductDTO(product);
    }

    @GET
    @NotNull
    @Path("/getProducts")
    @WebMethod(operationName = "getProducts")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ProductDTO> getProducts() {
        return productDAO.getProducts().stream().map(ProductDTO::new).collect(Collectors.toList());
    }

    @GET
    @NotNull
    @Path("/getProductListByCategoryId")
    @WebMethod(operationName = "getProductListByCategoryId")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ProductDTO> getProductListByCategoryId(
            @QueryParam(value = "categoryId")
            @WebParam(name = "categoryId", partName = "categoryId")
            @Nullable final String categoryId
    ) {
        return productDAO.getProductListByCategoryId(categoryId).stream().map(ProductDTO::new).collect(Collectors.toList());
    }
}
