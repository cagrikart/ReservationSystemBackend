package com.cke.reservationsystembackend.core.utilities.results;

public class ErrorResult extends Result{
    public ErrorResult() {
        super(false);
    }

    public ErrorResult(boolean success) {
        super(success);
    }

    public ErrorResult(boolean success, String messeage) {
        super(success, messeage);
    }
    public ErrorResult( String messeage) {
        super(false);
    }
}
