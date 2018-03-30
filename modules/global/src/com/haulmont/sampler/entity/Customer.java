package com.haulmont.sampler.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import com.haulmont.cuba.core.entity.FileDescriptor;

@NamePattern("%s %s|name,lastName")
@Table(name = "SAMPLER_CUSTOMER")
@Entity(name = "sampler$Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = -3420505556417816206L;

    @Column(name = "NAME", length = 50, nullable = false)
    protected String name;

    @Column(name = "LAST_NAME", length = 100, nullable = false)
    protected String lastName;

    @Column(name = "AGE")
    protected Integer age;

    @Column(name = "ACTIVE", nullable = false)
    protected Boolean active = false;

    @Column(name = "GRADE")
    protected Integer grade;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AVATAR_ID")
    protected FileDescriptor avatar;

    public void setAvatar(FileDescriptor avatar) {
        this.avatar = avatar;
    }

    public FileDescriptor getAvatar() {
        return avatar;
    }

    public void setGrade(CustomerGrade grade) {
        this.grade = grade == null ? null : grade.getId();
    }

    public CustomerGrade getGrade() {
        return grade == null ? null : CustomerGrade.fromId(grade);
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getActive() {
        return active;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }
}