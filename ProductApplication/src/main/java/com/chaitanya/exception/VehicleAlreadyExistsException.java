package com.chaitanya.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus marks a method or exception class with the status code and reason message that should be returned
@ResponseStatus(code = HttpStatus.CONFLICT , reason = "Product already exists")
public class VehicleAlreadyExistsException extends Exception
{


}
