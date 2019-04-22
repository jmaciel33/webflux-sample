package com.julio.sample.service;

import com.julio.sample.domain.User;
import com.julio.sample.domain.UserKey;
import com.julio.sample.exception.DataNotFoundException;
import com.julio.sample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Mono<User> getUserByCpf(String cpf) {
        return this.userRepository.findById(new UserKey(cpf))
                .switchIfEmpty(Mono.error(
                        new DataNotFoundException("User not Found")));
    }

    @Override
    public Flux<User> getAllUsers() {
        return this.userRepository.findAll()
                .switchIfEmpty(Mono.error(
                        new DataNotFoundException("The database is empty")));
    }
}
