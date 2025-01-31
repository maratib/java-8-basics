package com.mak;

public enum Enum {
    MSG1("Message 1"), MSG2("Message 2"), MSG3("Message 3");    

    private final String message;
    
    Enum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    
}
