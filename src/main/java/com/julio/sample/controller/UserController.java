package com.julio.sample.controller;

import com.julio.sample.domain.User;
import com.julio.sample.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @ResponseBody
    @GetMapping(value = "/user/{cpf}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Mono<User> getUserByCpf(@PathVariable("cpf") String cpf) {
        return this.userService.getUserByCpf(cpf);
    }

    @ResponseBody
    @GetMapping(value = "/user", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Flux<User> getAllUsers(){
        return this.userService.getAllUsers();
    }

}
