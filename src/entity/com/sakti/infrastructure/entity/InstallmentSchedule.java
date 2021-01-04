package com.sakti.infrastructure.entity;

import java.sql.Timestamp;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="installment_schedule")
@Access(AccessType.FIELD)
@NoArgsConstructor
@AllArgsConstructor
public class InstallmentSchedule {

	@EmbeddedId
	private InstallmentSchedulePK id;
	
	@Column(name="principal_amount")
	private double principalAmount;
	
	@Column(name="interest_amount")
	private double interestAmount;
	
	@Column(name="installment_amount")
	private double installmentAmount;
	
	@Column(name="due_date")
	private Timestamp dueDate;
	
	@Column(name="os_principal")
	private double osPrincipal;
	
	@Column(name="paid_status")
	private String paidStatus;
	
	@Column(name="created_at")
	private Timestamp createdAt;
	
	@Column(name="update_at")
	private Timestamp updateAt;

}
