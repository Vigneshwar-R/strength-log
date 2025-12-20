package com.strengthlog.service;
import java.util.Optional;


import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.strengthlog.repository.UserRepository;

import com.strengthlog.entity.User;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImplementation implements UserService
{

   private final UserRepository userRepository;
   private final PasswordEncoder passwordEncoder;

   @Override
   public User save(User user)
    {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

   @Override
   public Optional<User> findByUsername(String username)
   {
        return userRepository.findByUsername(username);
   }  

   @Override
   public Optional<User> findByEmail(String email)
   {
        return userRepository.findByEmail(email);
   }

   @Override
   public boolean existsByUsername(String username)
   {
        return userRepository.existsByUsername(username);
   }

   @Override
   public boolean existsByEmail(String email)
   {
        return userRepository.existsByEmail(email);
   }
   
}