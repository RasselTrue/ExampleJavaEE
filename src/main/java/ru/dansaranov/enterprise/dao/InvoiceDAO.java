package ru.dansaranov.enterprise.dao;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.dansaranov.enterprise.entity.Invoice;
import ru.dansaranov.enterprise.interceptors.LogInterceptor;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import java.util.List;

@Stateless
@Interceptors({LogInterceptor.class})
public class InvoiceDAO extends AbstractDAO{

    public Invoice findOne(String id) {
        return em.find(Invoice.class, id);
    }

    @NotNull
    public List<Invoice> getInvoices() {
        return em.createQuery("SELECT e FROM Invoice e ORDER BY  e.created DESC", Invoice.class).getResultList();
    }

    @Nullable
    public Invoice getInvoiceById(@Nullable final String invoiceId) {
        if (invoiceId == null || invoiceId.isEmpty()) return null;
        return getEntity(em.createQuery("SELECT e FROM Invoice e WHERE e.id =:id", Invoice.class)
                .setParameter("id", invoiceId)
                .setMaxResults(1));
    }

    @Nullable
    public Invoice persist(@Nullable final Invoice invoice) {
        if (invoice == null) return null;
        em.persist(invoice);
        return invoice;
    }

    @Nullable
    public Invoice merge(@Nullable final Invoice invoice) {
        if (invoice == null) return null;
        return em.merge(invoice);
    }

    public void removeInvoiceById(@Nullable final String invoiceId) {
        @Nullable final Invoice invoice = getInvoiceById(invoiceId);
        if (invoice == null) return;
        em.remove(invoice);
    }

}
