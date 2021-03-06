/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tt.dbernat.springwithboothelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Bernat
 */
@RestController
@EnableAutoConfiguration
public class HelloWorld {

    @RequestMapping("/")
    String home() {
        return "This is hello world with spring boot!!!";
    }
    
   public static void main(String[] args) throws Exception{
       SpringApplication.run(HelloWorld.class, args);
   }

}
