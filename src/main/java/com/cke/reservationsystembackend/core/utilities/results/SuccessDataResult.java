package com.cke.reservationsystembackend.core.utilities.results;

import com.cke.reservationsystembackend.core.utilities.results.DataResult;

public class SuccessDataResult<T> extends DataResult {
    public SuccessDataResult(T data, String message) {
        super(data, true,message);
    }
    public SuccessDataResult(T data) {
        super(data, true);
    }
    public SuccessDataResult( String message) {
        super(null, true,message);
    }
}