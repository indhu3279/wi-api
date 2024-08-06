package com.example.demo;

import com.example.demo.model.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtUtil {
    @Value("${spring.security.jwt.secret}")
    private String secret;
    @Value("${spring.security.jwt.expiration-ms}")
    private long expirationMs;

    public String generateToken(User user) {
        return Jwts.builder()
                   .setSubject(user.getUsername())
                   .claim("userId", user.getId())
                   .claim("role", user.getRole())
                   .setIssuedAt(new Date())
                   .setExpiration(new Date(System.currentTimeMillis() + expirationMs))
                   .signWith(SignatureAlgorithm.HS512, secret)
                   .compact();
    }

    public boolean validateToken(String token) {
        try {
            Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public String getUsernameFromToken(String token) {
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().getSubject();
    }

    public Long getUserIdFromToken(String token) {
        return Long.valueOf(Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().get("userId").toString());
    }
}
