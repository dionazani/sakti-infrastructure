package com.sakti.infrastructure.entity;

import java.sql.Timestamp;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="callback_payment")
@Access(AccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CallbackPayment {

	@Id
    @SequenceGenerator(name="callback_payment_id_seq",sequenceName="callback_payment_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "callback_payment_id_seq", strategy = GenerationType.SEQUENCE)
	@Column(name="id")
	private long id;
	
	@Column(name="partner_code")
	private String partnerCode;
	
	@Column(name="reference_number")
	private String referenceNumber;
	
	@Column(name="account_number")
	private String accountNumber;
	
	@Column(name="amount")
	private double amount;
	
	private String step;
	
	@Column(name="created_at")
	private Timestamp createdAt;
	
	@Column(name="updated_at")
	private Timestamp updatedAt;
	
	@Column(name="payload")
	private String payload;
	
	@Column(name="paymentAt")
	private Timestamp paymentAt;
}
