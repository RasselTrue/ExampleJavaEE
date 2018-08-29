package ru.dansaranov.enterprise.dto;

import org.jetbrains.annotations.Nullable;
import ru.dansaranov.enterprise.entity.Category;
import ru.dansaranov.enterprise.entity.Invoice;
import ru.dansaranov.enterprise.entity.Product;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class ProductDTO {

    @Nullable
    private String id;

    @Nullable
    private String name;

    @Nullable
    private String description;

    @Nullable
    private Date dateBegin;

    @Nullable
    private Date dateEnd;

    @Nullable
    private String categoryId;

    @Nullable
    private String invoiceId;

    public ProductDTO() {

    }

    public ProductDTO (@Nullable Product product) {
        if (product == null) return;
        id = product.getId();
        name = product.getName();
        description = product.getDescription();
        dateBegin = product.getDateBegin();
        dateEnd = product.getDateEnd();

        @Nullable Category category = product.getCategory();
        if (category != null) categoryId = category.getId();

        @Nullable Invoice invoice = product.getInvoice();
        if (invoice != null) invoiceId = invoice.getId();
    }

    @Nullable
    public String getId() {
        return id;
    }

    public void setId(@Nullable final String id) {
        this.id = id;
    }

    @Nullable
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(@Nullable final String categoryId) {
        this.categoryId = categoryId;
    }

    @Nullable
    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(@Nullable final String invoiceId) {
        this.invoiceId = invoiceId;
    }

    @Nullable
    public String getName() {
        return name;
    }

    public void setName(@Nullable final String name) {
        this.name = name;
    }

    @Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(@Nullable final String description) {
        this.description = description;
    }

    @Nullable
    public Date getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(@Nullable final Date dateBegin) {
        this.dateBegin = dateBegin;
    }

    @Nullable
    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(@Nullable final Date dateEnd) {
        this.dateEnd = dateEnd;
    }

}
