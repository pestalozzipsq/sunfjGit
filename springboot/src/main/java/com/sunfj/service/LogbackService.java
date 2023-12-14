package com.sunfj.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LogbackService {
    private static final Logger logger = LoggerFactory.getLogger(LogbackService.class);
    public void test(){
        logger.error("=====error=====");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");
        logger.trace("trace");
    }
}
