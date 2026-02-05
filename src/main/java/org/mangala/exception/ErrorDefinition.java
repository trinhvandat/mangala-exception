package org.mangala.exception;

import org.springframework.http.HttpStatus;

public interface ErrorDefinition {
    HttpStatus getHttpStatus();
    String getErrorCode();
    String getErrorMessage();
}
