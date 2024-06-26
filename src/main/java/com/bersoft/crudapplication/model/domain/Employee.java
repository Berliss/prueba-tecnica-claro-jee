package com.bersoft.crudapplication.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Long id;
    private String name;
    private String lastname;
    private String address;
    private Integer age;
    private Double salary;
    private String dni;
}
