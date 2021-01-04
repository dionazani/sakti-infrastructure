package com.sakti.infrastructure.entity;

import java.io.Serializable;
import java.sql.Timestamp;
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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="product")
@Access(AccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {

	@Id
    @SequenceGenerator(name="product_id_seq",sequenceName="product_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "product_id_seq", strategy = GenerationType.SEQUENCE)
	@Column(name="id")
	private int id;
	
	@Column(name="product_group_id")
	private int productGroupId;
	
	private String code;
	
	private String description;
	
	private short isActive;
	
	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="created_user_id")
	private long createdUserId;
	
	@Column(name="updated_at", insertable=false)
	private Timestamp updatedAt;

	@Column(name="updated_user_id", insertable=false)
	private Long updatedUserId;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="product_group_id", referencedColumnName="id", insertable = false, updatable = false)
	private ProductGroup productGroup;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="created_user_id", referencedColumnName="id", insertable = false, updatable = false)
	private AppUser createdUser;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="updated_user_id", referencedColumnName="id", insertable = false, updatable = false)
	private AppUser updatedUser;
}
