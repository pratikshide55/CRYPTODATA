package com.jts.component;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AuthorizationInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // Retrieve the "Authorization" header from the request
        String authHeader = request.getHeader("Authorization");

        // Check if the "Authorization" header is present and not empty
        if (authHeader != null && !authHeader.isEmpty()) {
            // Allow the request to proceed to the controller
            return true;
        }

        // If the header is missing, respond with HTTP status 401 Unauthorized
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Authorization header missing");
        // Return false to block the request
        return false;
    }
}
