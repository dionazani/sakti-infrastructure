package com.sakti.infrastructure.dto;

import lombok.Data;

@Data
public class ResponseDto {

	private String responseCode;
	private String responseMessage;
	private long time;
	private Object data;
}
