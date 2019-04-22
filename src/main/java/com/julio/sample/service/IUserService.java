package com.julio.sample.service;

import com.julio.sample.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IUserService {

    /**
     * This method serches user by CPF.
     * @param cpf
     * @return
     */
    Mono<User> getUserByCpf(String cpf);

    /**
     * This method list all users.
     * @return
     */
    Flux<User> getAllUsers();
}
