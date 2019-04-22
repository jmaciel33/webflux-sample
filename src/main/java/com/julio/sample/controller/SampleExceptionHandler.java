package com.julio.sample.controller;

import com.julio.sample.domain.ReactiveGenericError;
import com.julio.sample.exception.DataNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Exception handler.
 */
@RestControllerAdvice
public class SampleExceptionHandler {

    /**
     * Logger for SampleExceptionHandler class.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(SampleExceptionHandler.class);

    /**
     * Handler for DataNotFoundException. (HTTP Status 500)
     *
     * @param dataNotFoundException The exception.
     * @return An ErrorDTO with HTTP status code 500.
     */
    @ExceptionHandler(DataNotFoundException.class)
    public ResponseEntity<DataNotFoundException> httpServerErrorExceptionHandler(DataNotFoundException dataNotFoundException) {
        ReactiveGenericError error = null;

        error = new ReactiveGenericError("404", dataNotFoundException.getMessage());

        LOGGER.error("Error: {}", dataNotFoundException.getMessage());
        return new ResponseEntity(error, HttpStatus.NOT_FOUND);
    }

}
