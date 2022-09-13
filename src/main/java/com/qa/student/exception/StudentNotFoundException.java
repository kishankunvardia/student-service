package com.qa.student.exception;

import javax.persistence.EntityNotFoundException;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class StudentNotFoundException extends EntityNotFoundException{

}
