package com.uet.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

@Component
@CrossOrigin(origins = "*")
public class BaseController
{

    protected ResponseEntity success(Object response) {
        return new ResponseEntity(response, HttpStatus.OK);
    }

    protected ResponseEntity error(Exception ex) {
        return new ResponseEntity(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
