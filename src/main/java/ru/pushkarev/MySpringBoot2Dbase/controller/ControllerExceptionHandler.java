package ru.pushkarev.MySpringBoot2Dbase.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler
    @ResponseStatus(value = HttpStatus.I_AM_A_TEAPOT)
    public void allException(RuntimeException ex, WebRequest request) {

    }
}
