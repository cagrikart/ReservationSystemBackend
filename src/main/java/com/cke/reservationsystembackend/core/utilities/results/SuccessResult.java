package com.cke.reservationsystembackend.core.utilities.results;


import com.cke.reservationsystembackend.core.utilities.results.Result;

public class SuccessResult extends Result {

    public SuccessResult () {
        super(true);
    }
    public SuccessResult (String message) {
        super(true,message);
    }
}