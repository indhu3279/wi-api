//package com.example.demo.controllers;
//
//import com.example.demo.JwtUtil;
//import com.example.demo.model.ApiResponse;
//import com.example.demo.model.User;
//import com.example.demo.services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api")
//public class AuthController {
//    @Autowired
//    private UserService userService;
//    @Autowired
//    private JwtUtil jwtUtil;
//
//    @PostMapping("/signup")
//    public ResponseEntity<?> registerUser(@RequestBody User user) {
//        user.setRole("USER");
//        User newUser = userService.registerUser(user);
//        return ResponseEntity.ok(new ApiResponse("Account successfully created", 200, newUser.getId()));
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest) {
//        Optional<User> userOpt = userService.findByUsername(loginRequest.getUsername());
//        if (userOpt.isPresent() && passwordEncoder.matches(loginRequest.getPassword(), userOpt.get().getPassword())) {
//            String token = jwtUtil.generateToken(userOpt.get());
//            return ResponseEntity.ok(new LoginResponse("Login successful", 200, userOpt.get().getId(), token));
//        }
//        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ApiResponse("Incorrect username/password provided. Please retry", 401, null));
//    }
//}
//
