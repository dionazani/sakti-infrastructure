package com.sakti.infrastructure.entity;

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
@Table(name="product_offering")
@Access(AccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductOffering {

	@Id
    @SequenceGenerator(name="product_offering_id_seq",sequenceName="product_offering_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "product_offering_id_seq", strategy = GenerationType.SEQUENCE)
	@Column(name="id")
	private int id;
	
	@Column(name="product_id")
	private int productId;
	
	@Column(name="code")
	private String code;
	
	@Column(name="description")
	private String description;
	
	@Column(name="is_active")
	private short isActive;
	
	@Column(name="created_at")
	private java.sql.Timestamp createdAt;
	
	@Column(name="updated_at")
	private java.sql.Timestamp updatedAt;
	
	@Column(name="created_user_id")
	private int createdUserId;
	
	@Column(name="updated_user_id")
	private int updatedUserId;
	
	@Column(name="branch_id")
	private int branchId;
	
	@Column(name="tenour_behaviour")
	private String tenourBehaviour;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="created_user_id", referencedColumnName="id", insertable = false, updatable = false)
	private AppUser createdUser;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="updated_user_id", referencedColumnName="id", insertable = false, updatable = false)
	private AppUser updatedUser;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="branch_id", referencedColumnName="id", insertable = false, updatable = false)
	private Branch branch;
}
