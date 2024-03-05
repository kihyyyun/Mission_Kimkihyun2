package com.example.shop.jwt;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class LoginFilter extends UsernamePasswordAuthenticationFilter {


    private final AuthenticationManager authenticationManager;

    public LoginFilter(AuthenticationManager authenticationManager){
        this.authenticationManager =authenticationManager;
    }
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {

        //username, password 추출
        String username = obtainUsername(request);
        String password = obtainPassword(request);

        //token에 담아서 username과 password를 검증
        UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(username, password,null);

        return authenticationManager.authenticate(authToken);
    }

}
