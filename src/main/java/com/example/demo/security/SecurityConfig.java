//package com.example.demo.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//            .authorizeRequests()
//            .antMatchers("/api/signup", "/api/login").permitAll()
//            .anyRequest().authenticated()
//            .and()
//            .formLogin()
//            .loginProcessingUrl("/api/login")
//            .successHandler(new SimpleUrlAuthenticationSuccessHandler())
//            .failureHandler(new SimpleUrlAuthenticationFailureHandler())
//            .and()
//            .logout()
//            .logoutUrl("/api/logout")
//            .logoutSuccessHandler(new SimpleUrlLogoutSuccessHandler())
//            .invalidateHttpSession(true)
//            .deleteCookies("JSESSIONID");
//    }
//}
//
