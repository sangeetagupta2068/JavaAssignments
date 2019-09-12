package com.domain.sangeetagupta.demo_exception_handling;

public class InvalidUserException extends Exception{
    InvalidUserException(String message){
        super(message);
    }
}
