package com.ubs.opsit.interviews.berlinclock;

public class InvalidValueFortimeException extends RuntimeException {
    InvalidValueFortimeException(int val, String timeunit){
        super("Invalid value for " + timeunit +" value : " +  val);
    }
}
