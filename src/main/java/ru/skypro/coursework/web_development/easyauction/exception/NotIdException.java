package ru.skypro.coursework.web_development.easyauction.exception;


public class NotIdException extends RuntimeException{
    public NotIdException(String message) {
        super(message);
    }

    public NotIdException() {
        super();
    }
}
