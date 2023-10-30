package com.criscode.chatapp.model;

public record Message(
        String senderName,
        String receiverName,
        String message,
        String date,
        Status status
) {
    public enum Status {
        JOIN,
        MESSAGE,
        LEAVE
    }
}
