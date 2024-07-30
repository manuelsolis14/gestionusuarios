package com.demo.gestion.alumnos.gestionalumnos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.gestion.alumnos.gestionalumnos.entity.User;
import com.demo.gestion.alumnos.gestionalumnos.model.AuthResponse;
import com.demo.gestion.alumnos.gestionalumnos.model.RegistroUsers;
import com.demo.gestion.alumnos.gestionalumnos.service.AuthenticationService;
import com.demo.gestion.alumnos.gestionalumnos.service.JwtService;

@RequestMapping("/acceso")
@RestController
public class AuthController {

	@Autowired
	private JwtService jwtService;

	@Autowired
	private AuthenticationService authenticationService;

	@PostMapping("/registro")
    public ResponseEntity<User> register(@RequestBody RegistroUsers registerUserDto) {
        User registeredUser = authenticationService.signup(registerUserDto);

        return ResponseEntity.ok(registeredUser);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> authenticate(@RequestBody RegistroUsers loginUserDto) {
        User authenticatedUser = authenticationService.authenticate(loginUserDto);

        String jwtToken = jwtService.generateToken(authenticatedUser);

        AuthResponse loginResponse = new AuthResponse();
        loginResponse.setToken(jwtToken);
        loginResponse.setExpiresIn(jwtService.getExpirationTime());

        return ResponseEntity.ok(loginResponse);
    }

}
