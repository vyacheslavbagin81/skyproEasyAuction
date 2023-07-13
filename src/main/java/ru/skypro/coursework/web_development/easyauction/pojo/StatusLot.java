package ru.skypro.coursework.web_development.easyauction.pojo;

public enum StatusLot {
    STARTED("STARTED"),
    STOPPED("STOPPED"),
    CREATED("CREATED");

    private final String status;
    StatusLot(String status) {
        this.status=status;
    }

    public String getStatus() {
        return status;
    }
}
