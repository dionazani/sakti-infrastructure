package com.sakti.infrastructure.entity;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Null;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="debtor_job")
@Access(AccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DebtorJob {

	@Id
    @SequenceGenerator(name="debtor_job_id_seq",sequenceName="debtor_job_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "debtor_job_id_seq", strategy = GenerationType.SEQUENCE)
	@Column(name="id")
	private long id;
	
	@Column(name="debtor_id")
	private int debtorId;
	
	private int jobTypeId;
	
	
	@Column(name="corporate_type_id")
	private int corporateTypeId;
	
	private String corporateName;
	
	@Column(name="address_1")
	private String address1;
	
	@Column(name="address_2")
	private String address2;
	
	@Column(name="zipcode_id")
	private int zipcodeId;
	
	private String rt;
	private String rw;
	private String areaPhone;
	private String phone;
	private Integer economicSectorId;
	private Integer jobRoleId;
	private String identityNumber;
	private java.util.Date joiningDate;
	private double monthlyIncome;
	
	@Column(name="created_at")
	private java.util.Date createdAt;
	
	@Column(name="created_user_id")
	private Integer createdUserId;
	
	@Column(name="updated_at")
	private java.util.Date updatedAt;
	
	@Column(name="updated_user_id", nullable=true)
	private Integer updatedUserId;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="zipcode_id", referencedColumnName="id", insertable = false, updatable = false)
	private Zipcode zipcode;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="created_user_id", referencedColumnName="id", insertable = false, updatable = false)
	private AppUser createdUser;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="updated_user_id", referencedColumnName="id", insertable = false, updatable = false, nullable=true)
	private AppUser updatedUser;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="corporate_id", referencedColumnName="id", insertable = false, updatable = false)
	private CorporateType corporateType;
}
