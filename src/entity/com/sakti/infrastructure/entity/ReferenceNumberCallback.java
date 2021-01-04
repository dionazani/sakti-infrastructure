package com.sakti.infrastructure.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="reference_number_callback")
@Access(AccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReferenceNumberCallback {

	@Id
	@Column(name="reference_number_id")
	private long referenceNumberId;
	
	@Column(name="callback_payment_id")
	private long callbackPaymentId;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="callback_payment_id", referencedColumnName="id", insertable = false, updatable = false)
	private CallbackPayment callbackPayment;
}
