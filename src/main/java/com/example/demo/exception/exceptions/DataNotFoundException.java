package com.example.demo.exception.exceptions;

import com.example.demo.exception.ReturnCode;

public class DataNotFoundException extends BaseException{
    public DataNotFoundException(String msg) {
        this.returnCode = ReturnCode.DataNotFound;
        this.msg = msg;
    }
}
