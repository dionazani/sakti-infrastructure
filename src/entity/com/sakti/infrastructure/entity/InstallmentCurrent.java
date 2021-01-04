package com.sakti.infrastructure.entity;

import java.sql.Timestamp;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="installment_current")
@Access(AccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InstallmentCurrent {

	@Id
	@Column(name="credit_app_id")
	private long creditAppId;
	
	@Column(name="transaction_type_id")
	private int transactionTypeId;
	
	@Column(name="created_at")
	private Timestamp createdAt;
}
