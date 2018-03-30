package com.haulmont.sampler.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "SAMPLER_INCOME_EXPENSES")
@Entity(name = "sampler$IncomeExpenses")
public class IncomeExpenses extends StandardEntity {
    private static final long serialVersionUID = 5020021359083632584L;

    @Column(name = "YEAR_", nullable = false)
    protected Integer year;

    @Column(name = "INCOME", nullable = false)
    protected Double income;

    @Column(name = "EXPENSES", nullable = false)
    protected Double expenses;

    @Column(name = "ALPHA")
    protected Double alpha;

    @Column(name = "DASH_LENGTH_LINE")
    protected Integer dashLengthLine;

    @Column(name = "DASH_LENGTH_COLUMN")
    protected Integer dashLengthColumn;

    @Column(name = "ADDITIONAL")
    protected String additional;

    public void setAdditional(String additional) {
        this.additional = additional;
    }

    public String getAdditional() {
        return additional;
    }


    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getYear() {
        return year;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Double getIncome() {
        return income;
    }

    public void setExpenses(Double expenses) {
        this.expenses = expenses;
    }

    public Double getExpenses() {
        return expenses;
    }

    public void setAlpha(Double alpha) {
        this.alpha = alpha;
    }

    public Double getAlpha() {
        return alpha;
    }

    public void setDashLengthLine(Integer dashLengthLine) {
        this.dashLengthLine = dashLengthLine;
    }

    public Integer getDashLengthLine() {
        return dashLengthLine;
    }

    public void setDashLengthColumn(Integer dashLengthColumn) {
        this.dashLengthColumn = dashLengthColumn;
    }

    public Integer getDashLengthColumn() {
        return dashLengthColumn;
    }
}