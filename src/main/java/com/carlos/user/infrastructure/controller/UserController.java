package com.carlos.user.infrastructure.controller;

import com.carlos.user.infrastructure.Service.UserService;
import com.carlos.user.infrastructure.dtos.UserRequestDTO;
import com.carlos.user.infrastructure.dtos.UserResponseDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping("user")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserResponseDTO> createUser(@RequestBody UserRequestDTO dto){
        return ResponseEntity.ok(userService.save(dto));
    }
}
