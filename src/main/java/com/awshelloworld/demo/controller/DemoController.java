package com.awshelloworld.demo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/awshelloworld")
public class DemoController {

    @RequestMapping(path = "", method = RequestMethod.GET)
    public ResponseEntity<String> getResponse() {
        return ResponseEntity.ok("This is Eric's AWS hello world app!");
    }

}
