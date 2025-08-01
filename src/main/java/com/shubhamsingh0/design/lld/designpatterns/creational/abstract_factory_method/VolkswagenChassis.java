package com.shubhamsingh0.design.lld.designpatterns.creational.abstract_factory_method;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public abstract class VolkswagenChassis {
    private VolkswagenEngine volkswagenEngine;
    private VolkswagenTire volkswagenTire;
}
