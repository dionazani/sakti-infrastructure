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
public class InstallmentCurrentDetailPK implements Serializable {

	private int id;
	private long installmentCurrentId;
}
