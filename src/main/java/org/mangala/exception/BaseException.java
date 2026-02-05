package org.mangala.exception;

import lombok.Getter;

@Getter
public class BaseException extends RuntimeException {
    private final ErrorDefinition errorDefinition;

    protected BaseException(ErrorDefinition errorDefinition) {
        this.errorDefinition = errorDefinition;
    }
}
