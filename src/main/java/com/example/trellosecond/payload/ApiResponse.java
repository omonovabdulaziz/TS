package com.example.trellosecond.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ApiResponse {
    private String message;
    private Object object;
    private Integer statusCode;
}
