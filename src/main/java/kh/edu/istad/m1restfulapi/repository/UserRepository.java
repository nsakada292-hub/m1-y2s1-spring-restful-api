package kh.edu.istad.m1restfulapi.repository;

import kh.edu.istad.m1restfulapi.entity.User;
import org.springframework.stereotype.Repository;
import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class UserRepository {

    private List<User> userList;

    public UserRepository(){
        User user1 = new User(UUID.randomUUID(), "admin", "12345", "SKD", true);
        User user2 = new User(UUID.randomUUID(), "manager", "12345", "NIN", true);
        User user3 = new User(UUID.randomUUID(), "customer", "12345", "Albert", true);
        userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
    }

    public boolean checkById(UUID id){
        return userList.stream()
                .anyMatch(user -> user.getId().equals(id));
    }

//    Repo Here
    public List<User> selectAll(){
        return userList;
    }

    public void insertOne(User user){
        userList.add(user);
    }

    public void deleteOne(UUID id){
        userList.removeIf(user -> user.getId().equals(id));
    }

}
