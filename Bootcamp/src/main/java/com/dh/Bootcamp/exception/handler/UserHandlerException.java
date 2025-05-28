package com.dh.Bootcamp.exception.handler;

import com.dh.Bootcamp.controller.UserController;
import com.dh.Bootcamp.dto.ErrorDTO;
import com.dh.Bootcamp.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@ControllerAdvice(assignableTypes = UserController.class)
public class UserHandlerException {

    @ExceptionHandler(NotFoundException.class)
    ResponseEntity<ErrorDTO> notFound(NotFoundException exception){
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setName("Not Found Exception");
        errorDTO.setMessage("Element not founded");
        return new ResponseEntity<>(errorDTO, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    ResponseEntity<ErrorDTO> validatingDataTypes(MethodArgumentNotValidException exception){
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setName("Payload's Field Not Valid Exception");
        errorDTO.setMessage("There are some fields that don't respect validations");

        HashMap<String, List<String>> errors = new HashMap<>();

        exception.getFieldErrors().forEach( e -> {
            String field = e.getField();
            String msg = e.getDefaultMessage();

            // Example 1

/*            List<String> errorFields = new ArrayList<>();
            if (errors.containsKey(e.getField())){
                errorFields = errors.get(field);
            }
            errorFields.add(msg);
            errors.put(field, errorFields);*/

            //example 2

/*            errors.computeIfAbsent(field,f -> new ArrayList<>(){ { add(msg); } });
            errors.computeIfPresent(field, (f, l) -> new ArrayList<>(){ { addAll(l); add(msg); } });*/

            // Example 3

            errors.compute(field, ($, l) ->
                    new ArrayList<>(){
                        {
                            addAll(!Objects.isNull(l) ? l : new ArrayList<>());
                            add(msg);
                        }
                    }
            );
        });
        errorDTO.setErrorFields(errors);
        return new ResponseEntity<>(errorDTO, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    ResponseEntity<ErrorDTO> validations(HttpMessageNotReadableException exception){
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setName("Invalid Format For Payload Exception");
        errorDTO.setMessage(exception.getMessage());
        return new ResponseEntity<>(errorDTO, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    ResponseEntity<ErrorDTO> validatingDataTypes(ConstraintViolationException exception){
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setName("Payload's Field Not Valid Exception");
        errorDTO.setMessage("There are some fields that don't respect validations");

        return new ResponseEntity<>(errorDTO, HttpStatus.I_AM_A_TEAPOT);
    }
}
