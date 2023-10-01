package com.example.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ReturnCode {
    Ok(200, "Successful"),
    UnknownFailure(400, "Unknown failure"),
    DataNotFound(10000, "Data not found"),
    DataConflictError(10001, "Data conflict"),
    DatabaseError(10002, "Database error"),
    ;

    private final Integer code;
    private final String msg;
}
