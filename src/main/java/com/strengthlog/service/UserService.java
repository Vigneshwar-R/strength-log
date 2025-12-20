package com.strengthlog.service;

import java.util.Optional;
import com.strengthlog.entity.*;


public interface UserService 
{
    User save(User user);

    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);

    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
    
}
