package com.sakti.infrastructure.entity;

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
@Table(name="institute")
@Access(AccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Institute {

	@Id
    @SequenceGenerator(name="institute_id_seq",sequenceName="institute_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "institute_id_seq", strategy = GenerationType.SEQUENCE)
	@Column(name="id")
	private int id;
	
	@Column(name="corporate_type_id")
	private int corporateTypeId;
	
	@Column(name="corporate_name")
	private String corporateName;
	
	@Column(name="address_1")
	private String address1;
	
	@Column(name="address_2")
	private String address2;
	
	@Column(name="zipcode_id")
	private int zipcodeId;
	
	@Column(name="rt")
	private String rt;
	
	@Column(name="rw")
	private String rw;
	
	@Column(name="area_phone")
	private String areaPhone;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="economic_sector_id")
	private int economicSectorId;
}
