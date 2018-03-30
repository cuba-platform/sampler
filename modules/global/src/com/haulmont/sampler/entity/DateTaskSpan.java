package com.haulmont.sampler.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.List;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|category")
@Table(name = "SAMPLER_DATE_TASK_SPAN")
@Entity(name = "sampler$DateTaskSpan")
public class DateTaskSpan extends StandardEntity {
    private static final long serialVersionUID = 796558825459149346L;

    @Column(name = "CATEGORY")
    protected String category;

    @OrderBy("start")
    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "taskSpan")
    protected List<DateSegment> segments;

    public List<DateSegment> getSegments() {
        return segments;
    }

    public void setSegments(List<DateSegment> segments) {
        this.segments = segments;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}