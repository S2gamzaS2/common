package com.musinsam.common.response;

import org.springframework.http.HttpStatus;

public interface SuccessCode {
  Integer getCode();
  String getMessage();
  HttpStatus getHttpStatus();
}
