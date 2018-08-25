package ru.dansaranov.enterprise.controller;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.dansaranov.enterprise.dao.InvoiceDAO;
import ru.dansaranov.enterprise.entity.Invoice;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ViewScoped
@ManagedBean
public class InvoiceListController {

    @Inject
    private InvoiceDAO invoiceDAO;

    @NotNull
    public List<Invoice> getInvoiceList() {
        return invoiceDAO.getInvoices();
    }

    public void removeInvoiceById(@Nullable final String invoiceId) {
        invoiceDAO.removeInvoiceById(invoiceId);
    }

}
