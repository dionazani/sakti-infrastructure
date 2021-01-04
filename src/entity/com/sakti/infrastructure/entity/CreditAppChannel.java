package com.sakti.infrastructure.entity;

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
@Table(name="credit_app_channel")
@Access(AccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditAppChannel {

	@Id
	@Column(name="credit_app_id")
	private long creditAppId;
	
	@Column(name="payment_channel_partner_id")
	private int paymentChannelPartnerId;
	
	@Column(name="account_number")
	private String accountNumber;
}
