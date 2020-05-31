package com.sakti.infrastructure.entity;

import java.util.Date;
import java.util.UUID;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="debtor_person")
@Access(AccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DebtorPerson {
	
	@Id  
	private long debtorId;

	@Column(name="address_1")
	private String address1;

	@Column(name="address_2")
	private String address2;

	@Column(name="area_phone")
	private String areaPhone;
	
	@Column(name="zipcode_id")
	private long zipCodeId;

	@Column(name="dob")
	@Temporal(TemporalType.DATE)
	private Date dob;

	@Column(name="full_name")
	private String fullName;

	@Column(name="gender")
	private String gender;

	@Column(name="identity_image")
	private String identityImage;

	@Column(name="identity_number")
	private String identityNumber;

	@Column(name="identity_type")
	private String identityType;

	@Column(name="is_res_same_legal")
	private int isResSameLegal;

	@Column(name="legal_address_1")
	private String legalAddress1;

	@Column(name="legal_address_2")
	private String legalAddress2;

	@Column(name="legal_zipcode_id")
	private long legalZipCodeId;
	
	@Column(name="legal_area_phone")
	private String legalAreaPhone;

	@Column(name="legal_phone")
	private String legalPhone;

	@Column(name="mobile_phone")
	private String mobilePhone;

	@Column(name="mother_name")
	private String motherName;

	@Column(name="npwp_image")
	private String npwpImage;

	@Column(name="npwp_number")
	private String npwpNumber;

	@Column(name="phone")
	private String phone;

	@Column(name="pob")
	private String pob;

}
