package org.booking_hotel.utils;

public class ErrorMessage {
    private int status;
    private String message;
    private String description;

    public ErrorMessage() {

    }

    public ErrorMessage(int status, String message, String description) {
        this.status = status;
        this.message = message;
        this.description = description;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

