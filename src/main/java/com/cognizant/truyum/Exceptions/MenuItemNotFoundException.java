package com.cognizant.truyum.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "MenuItem not found")
public class MenuItemNotFoundException extends Exception{

}