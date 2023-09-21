package com.toy_project.o_mok.common;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import java.util.Map;

public class JwtProvider {

    public Map<String, String> createClaims(){
        return Map.of("", "");
    }

    public String token(){
        return Jwts.builder()
                .setHeader()
                .setClaims()
                .setExpiration()
                .signWith()
                .compact();
    }

}
