package com.dh.Bootcamp.dto.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UserDTO {

    @Size(max = 30, message = "Max size for name is 30")
    @NotNull(message = "The field should not be null")
    String name;

    String dni;
/*    @Email
    String email;

    @JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
    LocalDate date;
    String password;

    @Digits(integer = 8, fraction = 0, message = "The DNI should have 8 digits integers")
    @Positive(message = "The DNI should be positive")
    Integer dni;*/
}
