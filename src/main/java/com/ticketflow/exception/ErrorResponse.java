package com.ticketflow.exception;

public record ErrorResponse(String errorMessage,String error,Integer errorCode) {
}
