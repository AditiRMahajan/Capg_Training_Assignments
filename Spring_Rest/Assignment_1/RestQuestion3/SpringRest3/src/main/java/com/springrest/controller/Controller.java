package com.springrest.controller;

import com.springrest.ZipServices.zipServices;
import com.springrest.Zip.ZipCodes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private zipServices zs;

    @GetMapping("/")
    public String run(){
        return "Welcome!!";
    }

    @GetMapping("/{id}")
    public ZipCodes getByZipCodes(@PathVariable String id){
        return this.zs.getByZipCodes(id);
    }
    
}