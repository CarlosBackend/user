package com.carlos.user.infrastructure.Service;

import com.carlos.user.infrastructure.dtos.UserRequestDTO;
import com.carlos.user.infrastructure.dtos.UserResponseDTO;
import com.carlos.user.infrastructure.dtos.mapper.UserMapper;
import com.carlos.user.infrastructure.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository repository;
    private final UserMapper mapper;

   public UserResponseDTO save(UserRequestDTO dto){
       return mapper.toResponse(repository.save(mapper.toEntity(dto)));
   }
}
