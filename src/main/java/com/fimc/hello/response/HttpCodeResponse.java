package com.fimc.hello.response;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HttpCodeResponse implements Serializable {
	private String message;
	private int errorCode;
}
