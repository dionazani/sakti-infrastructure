package com.sakti.infrastructure.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InstallmentSchedulePK implements Serializable {

	private long id;
	private long creditAppId;
	
}
