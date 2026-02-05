package org.mangala.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class ApiResponseError {
    private String errorCode;
    private String errorMessage; // use for developer debug
}
