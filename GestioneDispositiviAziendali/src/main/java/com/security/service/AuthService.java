package com.security.service;

import com.security.payload.LoginDto;
import com.security.payload.RegisterDto;

public interface AuthService {

	String login(LoginDto loginDto);

	String register(RegisterDto registerDto);

}
