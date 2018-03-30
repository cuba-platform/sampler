package com.haulmont.sampler.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.Composition;
import java.util.List;
import javax.persistence.OrderBy;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|category")
@Table(name = "SAMPLER_TASK_SPAN")
@Entity(name = "sampler$TaskSpan")
public class TaskSpan extends StandardEntity {
    private static final long serialVersionUID = -7228039581376166100L;

    @Column(name = "CATEGORY")
    protected String category;

    @OrderBy("index")
    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "taskSpan")
    protected List<Segment> segments;

    public List<Segment> getSegments() {
        return segments;
    }

    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}