package com.faiz.project.repo.user;

import org.springframework.data.repository.CrudRepository;

import com.faiz.project.model.user.User;

public interface UserRepo extends CrudRepository<User, Integer> {

}
