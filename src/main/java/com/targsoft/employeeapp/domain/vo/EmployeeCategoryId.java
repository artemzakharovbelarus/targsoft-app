package com.targsoft.employeeapp.domain.vo;

import com.targsoft.employeeapp.exception.TypedIdException;

public class EmployeeCategoryId {

    private final Long id;

    public EmployeeCategoryId(final Long id) {
        this.id = id;

        validate();
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "EmployeeCategoryId{" +
                "id=" + id +
                '}';
    }

    private void validate() {
        if (id == null) {
            throw new TypedIdException("Id can't be null in {0}", this);
        }
    }
}
