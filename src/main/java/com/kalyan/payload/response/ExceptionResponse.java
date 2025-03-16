package com.kalyan.payload.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionResponse {
    private String message;
    private String error;
    private LocalDateTime timeStamp;
}
