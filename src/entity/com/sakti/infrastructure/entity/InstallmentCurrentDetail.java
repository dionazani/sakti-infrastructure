package com.sakti.infrastructure.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="installment_current_detail")
@Access(AccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InstallmentCurrentDetail {

	@EmbeddedId
	InstallmentCurrentDetailPK id;
	
	@Column(name="installment_schedule_id")
	private int installmentScheduleId;
	
	@Column(name="credit_app_id")
	private long creditAppId;
	
	@Column(name="principal_billed")
	private double principalBilled;
	
	@Column(name="interest_billed")
	private double interestBilled;
	
	@Column(name="late_day")
	private int lateDay;
	
	@Column(name="fine_amount")
	private double fineAmount;
	
	@Column(name="fine_billed")
	private double fineBilled;
	
	@Column(name="notes")
	private String notes;
}
