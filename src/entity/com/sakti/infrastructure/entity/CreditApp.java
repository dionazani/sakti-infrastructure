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
@Table(name="credit_app")
@Access(AccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditApp {

	@Id
    @SequenceGenerator(name="credit_app_id_seq",sequenceName="credit_app_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "credit_app_id_seq", strategy = GenerationType.SEQUENCE)
	@Column(name="id")
	private long id;
	
	@Column(name="branch_id")
	private int brancId;
	
	@Column(name="product_offering_id")
	private int productOfferingId;
	
	@Column(name="debtor_id")
	private int debtorId;
	
	@Column(name="request_number")
	private String requestNumber;
	
	@Column(name="request_date")
	private java.util.Date requestDate;
	
	@Column(name="app_step")
	private String appStep;
	
	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="updated_at")
	private Timestamp updateddAt;

	@Column(name="created_user_id")
	private int createdUserId;
	
	@Column(name="updated_user_id")
	private int updatedUserId;
	
	@Column(name="max_process_in_day")
	private short maxProcessInDay;
	
	@Column(name="app_status")
	private String appStatus;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="branch_id", referencedColumnName="id", insertable = false, updatable = false)
	private Branch branch;
}
