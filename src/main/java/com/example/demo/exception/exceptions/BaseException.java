package com.example.demo.exception.exceptions;

import com.example.demo.exception.Result;
import com.example.demo.exception.ReturnCode;

public class BaseException extends RuntimeException{
    protected ReturnCode returnCode;
    protected String msg;

    public BaseException() {
        this.returnCode = ReturnCode.UnknownFailure;
        this.msg = "";
    }

    public Result<String> getResult() {
        if (msg.isEmpty()) {
            return Result.failure(returnCode);
        }
        else {
            return Result.failure(returnCode, msg);
        }
    }
}
