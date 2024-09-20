package com.aws.practise.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Generated;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @NotBlank(message="userId cannot be blank")
    private String userId;

    @NotBlank(message="UserName cannot be blank")
    private String userName;

    @NotNull(message="Salary cannot be null")
    private Long salary;

}
