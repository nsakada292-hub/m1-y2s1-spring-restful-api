package kh.edu.istad.m1restfulapi.controller;

import kh.edu.istad.m1restfulapi.dto.UserCreateRequest;
import kh.edu.istad.m1restfulapi.dto.UserResponse;
import kh.edu.istad.m1restfulapi.entity.User;
import kh.edu.istad.m1restfulapi.repository.UserRepository;
import kh.edu.istad.m1restfulapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.ls.LSInput;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserResponse> getAll(){
        return userService.getAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public UserResponse create(@RequestBody UserCreateRequest userCreateRequest){
//       IO.print("Create new user: " + userCreateRequest);
        return userService.create(userCreateRequest);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id){
        userService.deleteById(id);
    }


//    @GetMapping("/{id}")
//    public User getById(@PathVariable UUID id){
//        return userService.getById(id);
//    }

}
