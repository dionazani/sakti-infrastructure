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
@Table(name="reference_number")
@Access(AccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReferenceNumber {
	
	@Id
    @SequenceGenerator(name="reference_number_id_seq",sequenceName="reference_number_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "reference_number_id_seq", strategy = GenerationType.SEQUENCE)
	@Column(name="id")
	private long id;
	
	@Column(name="transaction_type_id")
	private int transactionTypeId;
	
	@Column(name="reference_number_way_id")
	private int referenceNumberWayId;
	
	@Column(name="the_number")
	private String theNumber;
	
	@Column(name="transaction_amount")
	private double transactionAmount;
	
	@Column(name="transaction_date")
	private Timestamp transactionDate;
	
	@Column(name="description")
	private String description;
	
	@Column(name="created_at")
	private Timestamp createdAt;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="reference_number_type_id", referencedColumnName="id", insertable = false, updatable = false)
	private ReferenceNumberType referenceNumberType;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="reference_number_way_id", referencedColumnName="id", insertable = false, updatable = false)
	private ReferenceNumberWay referenceNumberWay;

}
