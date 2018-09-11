
package org.example.echo.service.skeleton;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.echo.service.skeleton package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RemoveProductByIdResponse_QNAME = new QName("http://service.enterprise.dansaranov.ru/", "removeProductByIdResponse");
    private final static QName _CreateProduct_QNAME = new QName("http://service.enterprise.dansaranov.ru/", "createProduct");
    private final static QName _GetProductListByCategoryIdResponse_QNAME = new QName("http://service.enterprise.dansaranov.ru/", "getProductListByCategoryIdResponse");
    private final static QName _Ping_QNAME = new QName("http://service.enterprise.dansaranov.ru/", "ping");
    private final static QName _RemoveProductById_QNAME = new QName("http://service.enterprise.dansaranov.ru/", "removeProductById");
    private final static QName _GetProductByIdResponse_QNAME = new QName("http://service.enterprise.dansaranov.ru/", "getProductByIdResponse");
    private final static QName _ProductDTO_QNAME = new QName("http://service.enterprise.dansaranov.ru/", "productDTO");
    private final static QName _GetProductById_QNAME = new QName("http://service.enterprise.dansaranov.ru/", "getProductById");
    private final static QName _ResultDTO_QNAME = new QName("http://service.enterprise.dansaranov.ru/", "resultDTO");
    private final static QName _GetProductsResponse_QNAME = new QName("http://service.enterprise.dansaranov.ru/", "getProductsResponse");
    private final static QName _GetProductListByCategoryId_QNAME = new QName("http://service.enterprise.dansaranov.ru/", "getProductListByCategoryId");
    private final static QName _CreateProductResponse_QNAME = new QName("http://service.enterprise.dansaranov.ru/", "createProductResponse");
    private final static QName _PingResponse_QNAME = new QName("http://service.enterprise.dansaranov.ru/", "pingResponse");
    private final static QName _GetProducts_QNAME = new QName("http://service.enterprise.dansaranov.ru/", "getProducts");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.echo.service.skeleton
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProductListByCategoryIdResponse }
     * 
     */
    public GetProductListByCategoryIdResponse createGetProductListByCategoryIdResponse() {
        return new GetProductListByCategoryIdResponse();
    }

    /**
     * Create an instance of {@link Ping }
     * 
     */
    public Ping createPing() {
        return new Ping();
    }

    /**
     * Create an instance of {@link GetProductsResponse }
     * 
     */
    public GetProductsResponse createGetProductsResponse() {
        return new GetProductsResponse();
    }

    /**
     * Create an instance of {@link ProductDTO }
     * 
     */
    public ProductDTO createProductDTO() {
        return new ProductDTO();
    }

    /**
     * Create an instance of {@link GetProductByIdResponse }
     * 
     */
    public GetProductByIdResponse createGetProductByIdResponse() {
        return new GetProductByIdResponse();
    }

    /**
     * Create an instance of {@link RemoveProductById }
     * 
     */
    public RemoveProductById createRemoveProductById() {
        return new RemoveProductById();
    }

    /**
     * Create an instance of {@link GetProductListByCategoryId }
     * 
     */
    public GetProductListByCategoryId createGetProductListByCategoryId() {
        return new GetProductListByCategoryId();
    }

    /**
     * Create an instance of {@link RemoveProductByIdResponse }
     * 
     */
    public RemoveProductByIdResponse createRemoveProductByIdResponse() {
        return new RemoveProductByIdResponse();
    }

    /**
     * Create an instance of {@link GetProducts }
     * 
     */
    public GetProducts createGetProducts() {
        return new GetProducts();
    }

    /**
     * Create an instance of {@link PingResponse }
     * 
     */
    public PingResponse createPingResponse() {
        return new PingResponse();
    }

    /**
     * Create an instance of {@link CreateProductResponse }
     * 
     */
    public CreateProductResponse createCreateProductResponse() {
        return new CreateProductResponse();
    }

    /**
     * Create an instance of {@link ResultDTO }
     * 
     */
    public ResultDTO createResultDTO() {
        return new ResultDTO();
    }

    /**
     * Create an instance of {@link GetProductById }
     * 
     */
    public GetProductById createGetProductById() {
        return new GetProductById();
    }

    /**
     * Create an instance of {@link CreateProduct }
     * 
     */
    public CreateProduct createCreateProduct() {
        return new CreateProduct();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveProductByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.enterprise.dansaranov.ru/", name = "removeProductByIdResponse")
    public JAXBElement<RemoveProductByIdResponse> createRemoveProductByIdResponse(RemoveProductByIdResponse value) {
        return new JAXBElement<RemoveProductByIdResponse>(_RemoveProductByIdResponse_QNAME, RemoveProductByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.enterprise.dansaranov.ru/", name = "createProduct")
    public JAXBElement<CreateProduct> createCreateProduct(CreateProduct value) {
        return new JAXBElement<CreateProduct>(_CreateProduct_QNAME, CreateProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductListByCategoryIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.enterprise.dansaranov.ru/", name = "getProductListByCategoryIdResponse")
    public JAXBElement<GetProductListByCategoryIdResponse> createGetProductListByCategoryIdResponse(GetProductListByCategoryIdResponse value) {
        return new JAXBElement<GetProductListByCategoryIdResponse>(_GetProductListByCategoryIdResponse_QNAME, GetProductListByCategoryIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.enterprise.dansaranov.ru/", name = "ping")
    public JAXBElement<Ping> createPing(Ping value) {
        return new JAXBElement<Ping>(_Ping_QNAME, Ping.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveProductById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.enterprise.dansaranov.ru/", name = "removeProductById")
    public JAXBElement<RemoveProductById> createRemoveProductById(RemoveProductById value) {
        return new JAXBElement<RemoveProductById>(_RemoveProductById_QNAME, RemoveProductById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.enterprise.dansaranov.ru/", name = "getProductByIdResponse")
    public JAXBElement<GetProductByIdResponse> createGetProductByIdResponse(GetProductByIdResponse value) {
        return new JAXBElement<GetProductByIdResponse>(_GetProductByIdResponse_QNAME, GetProductByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.enterprise.dansaranov.ru/", name = "productDTO")
    public JAXBElement<ProductDTO> createProductDTO(ProductDTO value) {
        return new JAXBElement<ProductDTO>(_ProductDTO_QNAME, ProductDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.enterprise.dansaranov.ru/", name = "getProductById")
    public JAXBElement<GetProductById> createGetProductById(GetProductById value) {
        return new JAXBElement<GetProductById>(_GetProductById_QNAME, GetProductById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.enterprise.dansaranov.ru/", name = "resultDTO")
    public JAXBElement<ResultDTO> createResultDTO(ResultDTO value) {
        return new JAXBElement<ResultDTO>(_ResultDTO_QNAME, ResultDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.enterprise.dansaranov.ru/", name = "getProductsResponse")
    public JAXBElement<GetProductsResponse> createGetProductsResponse(GetProductsResponse value) {
        return new JAXBElement<GetProductsResponse>(_GetProductsResponse_QNAME, GetProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductListByCategoryId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.enterprise.dansaranov.ru/", name = "getProductListByCategoryId")
    public JAXBElement<GetProductListByCategoryId> createGetProductListByCategoryId(GetProductListByCategoryId value) {
        return new JAXBElement<GetProductListByCategoryId>(_GetProductListByCategoryId_QNAME, GetProductListByCategoryId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.enterprise.dansaranov.ru/", name = "createProductResponse")
    public JAXBElement<CreateProductResponse> createCreateProductResponse(CreateProductResponse value) {
        return new JAXBElement<CreateProductResponse>(_CreateProductResponse_QNAME, CreateProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.enterprise.dansaranov.ru/", name = "pingResponse")
    public JAXBElement<PingResponse> createPingResponse(PingResponse value) {
        return new JAXBElement<PingResponse>(_PingResponse_QNAME, PingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProducts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.enterprise.dansaranov.ru/", name = "getProducts")
    public JAXBElement<GetProducts> createGetProducts(GetProducts value) {
        return new JAXBElement<GetProducts>(_GetProducts_QNAME, GetProducts.class, null, value);
    }

}
