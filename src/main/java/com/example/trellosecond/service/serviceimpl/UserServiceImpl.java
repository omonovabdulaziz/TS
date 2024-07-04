package com.example.trellosecond.service.serviceimpl;

import com.example.trellosecond.repository.UserRepository;
import com.example.trellosecond.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserDetails loadUserByUsername(String userNameFromToken) {
        return userRepository.findByEmail(userNameFromToken).orElseThrow(() -> new UsernameNotFoundException(userNameFromToken));
    }
}
