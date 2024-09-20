package com.aws.practise.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IncorrectInputProvide extends RuntimeException{

    private String code;
    private String message;
}
