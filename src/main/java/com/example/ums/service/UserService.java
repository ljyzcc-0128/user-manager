package com.example.ums.service;

import com.example.ums.dto.UserDTO;
import com.example.ums.entity.User;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);
    UserDTO getUserById(Long id);
    List<UserDTO> getAllUsers();
    UserDTO updateUser(Long id, UserDTO userDTO);
    void deleteUser(Long id);
    UserDTO getCurrentUser();
    void changePassword(String oldPassword, String newPassword);
}