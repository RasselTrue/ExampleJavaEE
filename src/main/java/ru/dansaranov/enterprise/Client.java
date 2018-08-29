package ru.dansaranov.enterprise;


import org.example.echo.service.skeleton.ProductDTO;
import org.example.echo.service.skeleton.ProductService;
import org.example.echo.service.skeleton.ProductServiceService;

public class Client {

    public static void main(String[] args) {
        ProductService service = new ProductServiceService().getProductServicePort();
        for (ProductDTO productDTO : service.getProducts()) {
            System.out.println(productDTO.getName());
        }
    }
}
