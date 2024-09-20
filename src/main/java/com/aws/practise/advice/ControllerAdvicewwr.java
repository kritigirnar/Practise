package com.aws.practise.advice;

import com.aws.practise.exception.CustomGlobalException;
import com.aws.practise.exception.IncorrectInputProvide;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdvicewwr {

    @ExceptionHandler(CustomGlobalException.class)
    public ResponseEntity<String> handleCustomGlobalException(CustomGlobalException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
