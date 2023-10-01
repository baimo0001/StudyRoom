package com.example.demo.exception.exceptions;

import com.example.demo.exception.ReturnCode;

public class DatabaseErrorException extends BaseException{
    public DatabaseErrorException(String msg) {
        this.returnCode = ReturnCode.DatabaseError;
        this.msg = msg;
    }

}
