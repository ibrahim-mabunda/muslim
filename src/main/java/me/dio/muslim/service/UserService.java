package me.dio.muslim.service;

import me.dio.muslim.domain.model.User;

public interface UserService {
    User findById(long id);
    User create(User userToCreate);
    User update(long id, User userToUpdate); // Método adicionado

}
