package com.sakti.infrastructure.dto;

import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class ResponseDto {

	private int HttpStatusCode;
	private String responseCode;
	private String responseMessage;
	private String clientMessage;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone="Asia/Jakarta")
	private Timestamp timestamp;
	private Object data;
}
