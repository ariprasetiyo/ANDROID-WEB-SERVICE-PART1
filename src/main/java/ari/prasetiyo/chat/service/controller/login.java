/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ari.prasetiyo.chat.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bsp-it-01
 */
@RestController
@RequestMapping("/api")
public class login {
    @RequestMapping(value = "/loginApp", method = RequestMethod.GET)
    public void loginApp(){
        
    }
}
