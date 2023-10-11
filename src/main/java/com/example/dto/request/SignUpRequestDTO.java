package com.example.dto.request;

import jakarta.validation.constraints.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SignUpRequestDTO {

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
