package com.cke.reservationsystembackend.core.utilities.results;

public class ErrorDataResult<T> extends DataResult{
    public ErrorDataResult(T data, boolean success, String messeage) {
        super(data, false, messeage);
    }

    public ErrorDataResult(T data, boolean success) {
        super(data, success);
    }
    public ErrorDataResult(T data) {
        super(data, false);
    }
    public ErrorDataResult( String message) {
        super(null, false,message);
    }
}
