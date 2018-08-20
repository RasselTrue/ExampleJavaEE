package ru.dansaranov.enterprise.entity;

import org.jetbrains.annotations.Nullable;
import ru.dansaranov.enterprise.api.WBS;

import java.util.Date;
import java.util.UUID;

public class Product implements WBS {

    @Nullable
    private String id = UUID.randomUUID().toString();

    @Nullable
    private String name = "";

    @Nullable
    private String description = "";

    @Nullable
    private Date dateBegin;

    @Nullable
    private Date dateEnd;

    @Nullable
    @Override
    public Date getDateBegin() {
        return dateBegin;
    }

    @Override
    public void setDateBegin(@Nullable final Date dateBegin) {
        this.dateBegin = dateBegin;
    }

    @Nullable
    @Override
    public Date getDateEnd() {
        return dateEnd;
    }

    @Override
    public void setDateEnd(@Nullable final Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Product() {

    }

    public Product(@Nullable final String name) {
        this.name = name;
    }

    @Nullable
    public String getId() {
        return id;
    }

    public void setId(@Nullable final String id) {
        this.id = id;
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
}
