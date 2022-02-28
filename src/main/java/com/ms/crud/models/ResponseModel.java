package com.ms.crud.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseModel {

    private int id;
    private int status;
    private String message;
    private String error;
    private Date timestamp;
    private String path;

    public ResponseModel(int id, String message) {
        this.id = id;
        this.message = message;
        this.timestamp = new Date();
    }

    public ResponseModel(int id, int status, String message) {
        this.id = id;
        this.status = status;
        this.message = message;
        this.timestamp = new Date();
    }

    public ResponseModel(int id, int status, String message, String path) {
        this.id = id;
        this.status = status;
        this.message = message;
        this.timestamp = new Date();
        this.path = path;
    }

    public ResponseModel(int id, int status, String message, String error, String path) {
        this.id = id;
        this.status = status;
        this.message = message;
        this.error = error;
        this.timestamp = new Date();
        this.path = path;
    }
}