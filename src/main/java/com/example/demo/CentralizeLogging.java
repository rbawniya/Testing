package com.example.demo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.UUID;

public class CentralizeLogging {

//    Single logger object should be created for this class
    private final static Logger logger = LoggerFactory.getLogger(CentralizeLogging.class);

    public static void main(String[] args) {
        String uniqqueId = UUID.randomUUID().toString();
        MDC.put("nsId", uniqqueId);
    }

    public static void clean(){
        MDC.clear();
    }
}

class InterceptorPrePost implements HandlerInterceptor {
    Logger logger = LoggerFactory.getLogger(InterceptorPrePost.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("id = {} ", MDC.get("nsId"));
        request.setAttribute("id", MDC.get("nsId"));
        return true;
    }
}
