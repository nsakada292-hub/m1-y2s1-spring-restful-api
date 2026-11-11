package kh.edu.istad.m1restfulapi.service;

import kh.edu.istad.m1restfulapi.dto.UserCreateRequest;
import kh.edu.istad.m1restfulapi.dto.UserResponse;
import kh.edu.istad.m1restfulapi.entity.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    void deleteById(UUID id);

    UserResponse create(UserCreateRequest userCreateRequest);

    List<UserResponse> getAll();

//    User getById(UUID id);

}
