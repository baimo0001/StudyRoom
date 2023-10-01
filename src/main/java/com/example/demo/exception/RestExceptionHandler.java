package com.example.demo.exception;

import com.example.demo.exception.exceptions.BaseException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
@Slf4j
public class RestExceptionHandler {
    @ExceptionHandler({Exception.class})
    public Result<String> returnException(Exception e) {
        log.error("Exception", e);
        return Result.failure(ReturnCode.UnknownFailure);
    }

    @ExceptionHandler(RuntimeException.class)
    public Result<String> returnRuntimeException(Exception e) {
        log.warn("RuntimeException", e);
        return Result.failure(ReturnCode.UnknownFailure);
    }

    @ExceptionHandler(BaseException.class)
    public Result<String> returnBaseException(BaseException e) {
        return e.getResult();
    }
}
