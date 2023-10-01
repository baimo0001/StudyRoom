package com.example.demo.exception.exceptions;

import com.example.demo.exception.ReturnCode;

public class DataConflictException extends BaseException{

    public DataConflictException() {
        this.returnCode = ReturnCode.DataConflictError;
    }
}
