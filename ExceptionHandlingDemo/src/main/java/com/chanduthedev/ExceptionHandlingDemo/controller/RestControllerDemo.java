package com.chanduthedev.ExceptionHandlingDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.chanduthedev.ExceptionHandlingDemo.exception.EntityNotFoundException;

@RestController
public class RestControllerDemo {

    @GetMapping("/{msg}")
    public String getMsg(@PathVariable String msg) {
        if (msg.length() < 3) {
            throw new EntityNotFoundException("resource not found for the msg " + "'" + msg + "'");
        }
        return msg;

    }
}
