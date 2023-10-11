package com.example.entity;

import lombok.NoArgsConstructor;

@NoArgsConstructor(force = true)
public record Test(
        String name, User user


) {
}
