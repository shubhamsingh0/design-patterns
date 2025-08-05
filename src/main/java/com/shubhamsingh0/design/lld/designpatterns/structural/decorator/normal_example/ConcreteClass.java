package com.shubhamsingh0.design.lld.designpatterns.structural.decorator.normal_example;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDate;

@Data
@EqualsAndHashCode
@ToString
public class ConcreteClass implements ExposedInterface {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public ConcreteClass(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public ConcreteClass getOriginalClass() {
        return new ConcreteClass(firstName,lastName,dateOfBirth);
    }
}
