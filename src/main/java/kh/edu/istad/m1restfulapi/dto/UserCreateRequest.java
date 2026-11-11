package kh.edu.istad.m1restfulapi.dto;

public record UserCreateRequest(
        String username,
        String password,
        String fullName
) {
}
