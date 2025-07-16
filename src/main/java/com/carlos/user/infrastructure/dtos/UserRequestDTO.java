package com.carlos.user.infrastructure.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDTO {
    @JsonProperty(required = true)
    private String name;
    @JsonProperty(required = true)
    private String password;
    @JsonProperty(required = true)
    private String email;
    @JsonProperty(required = true)
    private String phone;
}
