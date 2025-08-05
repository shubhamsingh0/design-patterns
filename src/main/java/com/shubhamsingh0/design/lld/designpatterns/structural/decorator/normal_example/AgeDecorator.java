package com.shubhamsingh0.design.lld.designpatterns.structural.decorator.normal_example;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
public class AgeDecorator implements ExposedInterface {
    ExposedInterface exposedInterface;

    public AgeDecorator(ExposedInterface exposedInterface) {
        this.exposedInterface = exposedInterface;
    }

    @Override
    public ConcreteClass getOriginalClass() {
        ConcreteClass concreteClass = exposedInterface.getOriginalClass();
        return new ConcreteClass(concreteClass.getFirstName(), concreteClass.getLastName(),
                concreteClass.getDateOfBirth().minusYears(3));
    }
}

