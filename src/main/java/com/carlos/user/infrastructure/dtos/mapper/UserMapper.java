package com.carlos.user.infrastructure.dtos.mapper;

import com.carlos.user.infrastructure.dtos.UserRequestDTO;
import com.carlos.user.infrastructure.dtos.UserResponseDTO;
import com.carlos.user.infrastructure.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserEntity toEntity(UserRequestDTO dto);
    UserResponseDTO toResponse(UserEntity entity);
}
