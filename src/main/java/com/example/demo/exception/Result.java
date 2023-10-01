package com.example.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;

    public Result(ReturnCode returnCode, T data) {
        this.code = returnCode.getCode();
        this.msg = returnCode.getMsg();
        this.data = data;
    }

    public static <T> Result<T> ok(T data) {
        return new Result<>(ReturnCode.Ok, data);
    }

    public static Result<String> ok() {
        return new Result<>(ReturnCode.Ok, "");
    }

    public static Result<String> failure(ReturnCode returnCode) {
        return new Result<>(returnCode, "");
    }

    public static Result<String> failure(ReturnCode returnCode, String msg) {
        return new Result<>(returnCode.getCode(), returnCode.getMsg(), msg);
    }
}