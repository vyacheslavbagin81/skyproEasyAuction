package ru.skypro.coursework.web_development.easyauction.exception;


public class StatusException extends RuntimeException{
    public StatusException(String message) {
        super(message);
    }

    public StatusException() {
        super();
    }
}
