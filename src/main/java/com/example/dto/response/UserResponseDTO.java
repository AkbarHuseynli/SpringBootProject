package com.example.dto.response;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponseDTO {

    @NotNull
    String firstname;
    @NotNull
    String surname;
    @Email
    String email;
    @Max(11)
    String phone;
    @NotBlank
    String username;
    @NotBlank
    String password;

}
