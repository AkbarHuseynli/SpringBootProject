package com.example.service;

import com.example.entity.ERole;
import com.example.entity.Role;

public interface RoleService {
    Role findByName(ERole roleName);
}
