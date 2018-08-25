package ru.dansaranov.enterprise.controller;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.dansaranov.enterprise.dao.InvoiceDAO;
import ru.dansaranov.enterprise.entity.Invoice;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ViewScoped
@ManagedBean
public class InvoiceEditController {

    @Inject
    private InvoiceDAO invoiceDAO;

    @Nullable
    private String id;

    @NotNull
    private Invoice invoice = new Invoice();

    public void init() {
        @Nullable final Invoice invoice = invoiceDAO.getInvoiceById(id);
        if (invoice != null) {
            this.invoice = invoice;
        }
    }

    @NotNull
    public String save() {
        invoiceDAO.merge(invoice);
        return "invoice-list";
    }

    @NotNull
    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(@NotNull final Invoice invoice) {
        this.invoice = invoice;
    }

    @Nullable
    public String getId() {
        return id;
    }

    public void setId(@Nullable final String id) {
        this.id = id;
    }

}
