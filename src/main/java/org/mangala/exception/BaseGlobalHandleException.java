package org.mangala.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BaseGlobalHandleException {
    @ExceptionHandler(BaseException.class)
    public ResponseEntity<ApiResponseError> handleBaseException(BaseException exception) {
        return ResponseEntity
                .status(exception.getErrorDefinition().getHttpStatus())
                .body(
                        ApiResponseError.of(
                                exception.getErrorDefinition().getErrorCode(),
                                exception.getErrorDefinition().getErrorMessage()
                        )
                );
    }
}
