package com.aws.practise.advice;

import com.aws.practise.exception.IncorrectInputProvide;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdvicewwr {

    @ExceptionHandler({IncorrectInputProvide.class, NullPointerException.class})
    public ResponseEntity<String> handleIncorrectInput(IncorrectInputProvide incorrectInputProvide)
    {
        return new ResponseEntity<>("Incorrect values are provides", HttpStatus.BAD_REQUEST);
    }

}
