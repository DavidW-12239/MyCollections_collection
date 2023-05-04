package com.myCollections.collection.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class NotEmptySubCollectionException extends RuntimeException  {
    private HttpStatus code;

    public NotEmptySubCollectionException(String message, HttpStatus code) {
        super(message);
        this.code = code;
    }
}
