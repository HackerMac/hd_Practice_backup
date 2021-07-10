package com.ihrm.gate.demo;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

/**
 * @Description TODO
 * @Date 2021/7/12
 * @Created by MINGKU
 */
public class CreateJwtTest {

    /**
     * 通过jjwt创建token
     * @param args
     */
    public static void main(String[] args) {
        JwtBuilder jwtBuilder = Jwts.builder().setId("888").setSubject("mingku")
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "uestc")
                .claim("companyId","123456")
                .claim("companyName","uestc");
        String token = jwtBuilder.compact();
        System.out.println(token);
    }
}
