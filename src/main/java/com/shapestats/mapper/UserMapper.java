package com.shapestats.mapper;

import com.shapestats.dto.UserRequestDTO;
import com.shapestats.dto.UserResponseDTO;
import com.shapestats.entity.User;

public class UserMapper {

    public static User toEntity(UserRequestDTO dto, String passwordHash) {
        User user = new User();
        user.setName(dto.name());
        user.setEmail(dto.email());
        user.setPasswordHash(passwordHash); // hash gerado no Service
        return user;
    }

    public static UserResponseDTO toDTO(User user) {
        return new UserResponseDTO(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getCreatedAt()
        );
    }
}
