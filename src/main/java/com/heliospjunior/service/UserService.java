package com.heliospjunior.service;

import com.heliospjunior.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
