package com.sakti.infrastructure.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="installment_payment_detail")
@Access(AccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InstallmentPaymentDetail {

	@EmbeddedId
	private InstallmentPaymentDetailPK id;
	
	@Column(name="installment_schedule_id")
	private int installmentScheduleId;
	
	@Column(name="credit_app_id")
	private long creditAppId;
	
	@Column(name="principal_paid")
	private Double principalPaid;
	
	@Column(name="interest_paid")
	private Double interestPaid;
	
	@Column(name="fine_paid")
	private Double finePaid;

}
