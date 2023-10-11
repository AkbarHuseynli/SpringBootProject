package com.example.service;

import com.example.entity.ERole;
import com.example.entity.Role;
import com.example.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Override
    public Role findByName(ERole roleName) {
        return roleRepository.findByRoleName(roleName);
    }
}
