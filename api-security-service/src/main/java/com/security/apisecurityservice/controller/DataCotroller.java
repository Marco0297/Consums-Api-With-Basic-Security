package com.security.apisecurityservice.controller;

import com.security.apisecurityservice.service.IDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/security")
public class DataCotroller {

    @Autowired
    private IDataService service;

    @GetMapping("/{id}")
    public ResponseEntity getById(@PathVariable("id") Long id){
        return new ResponseEntity(service.getByIdData(id), HttpStatus.OK);
    }
}
