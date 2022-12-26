package tech.getarrays.employeemanager.exception.handler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ApiError {

    private int code;
    private String status;
    private LocalDateTime timestamp;
    private String message;
}
