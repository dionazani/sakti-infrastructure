package com.sakti.infrastructure.entity;

import java.sql.Timestamp;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="installment_payment")
@Access(AccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InstallmentPayment {

	@Id
    @SequenceGenerator(name="installment_payment_id_seq",sequenceName="installment_payment_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "installment_payment_id_seq", strategy = GenerationType.SEQUENCE)
	@Column(name="id")
	private long id;
	
	@Column(name="reference_number_id")
	private long referenceNumberId;
	
	@Column(name="created_at")
	private Timestamp createdAt;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="reference_number_id", referencedColumnName="id", insertable = false, updatable = false)
	private ReferenceNumber referenceNumber;
}
