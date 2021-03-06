package ru.dansaranov.enterprise.entity;

import org.jetbrains.annotations.Nullable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Product extends AbstractEntity {

    @Nullable
    private String name = null;

    @Nullable
    private String description = null;

    @Nullable
    private Date dateBegin;

    @Nullable
    private Date dateEnd;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Invoice invoice;

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

    public Product() {

    }

    public Product(@Nullable final String name) {
        this.name = name;
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
    public Category getCategory() {
        return category;
    }

    public void setCategory(@Nullable final Category category) {
        this.category = category;
    }

    @Nullable
    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(@Nullable final Invoice invoice) {
        this.invoice = invoice;
    }
}
