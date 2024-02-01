package com.howtodoinjava.rest.config;

import java.io.IOException;



import javax.servlet.FilterChain;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;


import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.OncePerRequestFilter;





public class CORSFilter extends OncePerRequestFilter {



    @Override
    @Bean
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)

            throws ServletException, IOException {



        boolean preflight = request.getHeader("Access-Control-Request-Method") != null && "OPTIONS".equals(request.getMethod());



        addCORSHeaders(response, preflight);



        filterChain.doFilter(request, response);

        return;

    }



    private void addCORSHeaders(HttpServletResponse response, boolean preflight) {

        response.addHeader("Access-Control-Allow-Origin", "*");

        response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");

        response.addHeader("Access-Control-Allow-Headers", "Content-Type," + "requestType");

        response.addHeader("Access-Control-Max-Age", "30");// 30 min

    }

}
