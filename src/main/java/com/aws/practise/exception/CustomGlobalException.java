package com.aws.practise.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomGlobalException extends RuntimeException{

    private String code;
    private String message;
}
